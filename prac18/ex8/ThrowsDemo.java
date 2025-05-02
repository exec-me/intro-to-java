package prac18.ex8;

import java.util.Scanner;

public class ThrowsDemo {
    // Метод для получения ключа от пользователя
    public void getKey() {
        Scanner scanner = new Scanner(System.in); // Создаем Scanner для ввода
        String key; // Переменная для хранения введенного ключа
        boolean b = false; // Флаг для контроля цикла

        // Цикл будет выполняться, пока не будет введен корректный ключ
        while (!b) {
            try {
                key = scanner.nextLine(); // Читаем ввод пользователя
                printDetails(key); // Пытаемся обработать ключ
                b = true; // Если успешно - выходим из цикла
            } catch (Exception e) {
                // Обработка исключения - выводим сообщение об ошибке
                System.out.println(e.getMessage());
                System.out.println("Попробуйте еще раз.");
            }
        }
        scanner.close(); // Закрываем Scanner
    }

    // Метод для вывода деталей по ключу (может выбрасывать исключение)
    public void printDetails(String key) throws Exception {
        String message = getDetails(key); // Получаем детали по ключу
        System.out.println(message); // Выводим результат
    }

    // Метод для получения деталей по ключу (может выбрасывать исключение)
    private String getDetails(String key) throws Exception {
        if (key.isEmpty()) {
            // Если ключ пустой, бросаем исключение с сообщением
            throw new Exception("Ключ задан как пустая строка");
        }
        // Если ключ не пустой, возвращаем данные
        return "data for " + key;
    }

    // Точка входа в программу
    public static void main(String[] args) {
        ThrowsDemo t = new ThrowsDemo(); // Создаем экземпляр класса
        t.getKey(); // Запускаем метод получения ключа
    }
}
