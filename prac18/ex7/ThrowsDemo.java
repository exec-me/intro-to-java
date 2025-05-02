package prac18.ex7;

import java.util.Scanner;

// Класс ThrowsDemo для демонстрации работы с исключениями
public class ThrowsDemo {
    // Метод getKey запрашивает ключ у пользователя и вызывает printDetails
    public void getKey() throws Exception {
        Scanner scanner = new Scanner(System.in); // Создаём Scanner для чтения ввода
        System.out.println("Введите ключ:"); // Подсказка для пользователя
        String key = scanner.nextLine(); // Считываем введённую строку
        try {
            printDetails(key); // Пытаемся обработать ключ
        } finally {
            scanner.close(); // Закрываем Scanner в блоке finally, чтобы гарантировать закрытие
        }
    }

    // Метод printDetails получает данные по ключу и выводит их
    public void printDetails(String key) throws Exception {
        String message = getDetails(key); // Получаем данные по ключу
        System.out.println(message); // Выводим сообщение
    }

    // Метод getDetails возвращает данные по ключу или выбрасывает исключение
    private String getDetails(String key) throws Exception {
        if (key.isEmpty()) { // Проверяем, пустой ли ключ
            throw new Exception("Ключ задан как пустая строка"); // Выбрасываем исключение, если ключ пустой
        }
        return "data for " + key; // Возвращаем строку с данными
    }

    public static void main(String[] args) {
        ThrowsDemo t = new ThrowsDemo(); // Создаём экземпляр класса
        try {
            t.getKey(); // Пытаемся вызвать метод getKey
        } catch (Exception e) {
            System.err.println("Ошибка: " + e.getMessage()); // Обрабатываем исключение и выводим сообщение об ошибке
        }
    }
}
