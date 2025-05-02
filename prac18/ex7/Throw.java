package prac18.ex7;

import java.util.Scanner;

public class Throw {
    // Метод для получения ключа от пользователя
    public void getKey() {
        Scanner scanner = new Scanner(System.in);  // Создаем Scanner для ввода
        String key = scanner.nextLine();  // Читаем строку от пользователя
        try {
            printDetails(key);  // Пытаемся обработать ключ
        } catch (Exception e) {
            // Ловим и обрабатываем исключение из printDetails
            System.out.println("Произошла ошибка: " + e.getMessage());
        }
        scanner.close();  // Закрываем Scanner (лучше использовать try-with-resources)
    }

    // Метод для получения деталей по ключу (может выбрасывать Exception)
    private String getDetails(String key) throws Exception {
        if (key.isEmpty()) {
            // Бросаем исключение, если ключ пустой
            throw new Exception("Key set to empty string");
        }
        return "data for " + key;  // Возвращаем данные, если ключ валиден
    }

    // Метод для вывода деталей по ключу
    public void printDetails(String key) {
        try {
            String message = getDetails(key);  // Получаем детали по ключу
            System.out.println(message);  // Выводим сообщение
        } catch (Exception e) {
            // Преобразуем Exception в RuntimeException и пробрасываем дальше
            throw new RuntimeException("An error occurred in printDetails: " + e.getMessage(), e);
        }
    }

    // Точка входа в программу
    public static void main(String[] args) {
        Throw t = new Throw();  // Создаем экземпляр класса

        // Первый тест - с вводом от пользователя
        t.getKey();

        // Второй тест - явная проверка обработки null
        try {
            t.printDetails(null);  // Намеренно передаем null
        } catch (Exception e) {
            System.out.println(e.getMessage());  // Обрабатываем исключение
        }
    }
}
