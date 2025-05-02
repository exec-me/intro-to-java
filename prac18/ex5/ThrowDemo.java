package prac18.ex5;

import java.util.Scanner;

public class ThrowDemo {

    // Метод, который пытается получить сообщение по ключу и вывести его
    public void printMessage(String key) {
        try {
            // Пытаемся получить строку с деталями по ключу
            String message = getDetails(key);
            // Если всё прошло успешно, выводим сообщение
            System.out.println(message);
        } catch (NullPointerException e) {
            // Если было выброшено исключение, выводим его сообщение
            System.out.println("Caught an exception: " + e.getMessage());
        }
    }

    // Метод, возвращающий строку с информацией по ключу
    public String getDetails(String key) {
        // Если ключ равен null, выбрасываем исключение
        if(key == null) {
            throw new NullPointerException("null key in getDetails");
        }
        // Иначе возвращаем данные для ключа
        return "data for " + key;
    }

    // Главный метод — точка входа в программу
    public static void main(String[] args) {
        // Создаем объект Scanner для считывания строки из консоли
        Scanner scanner = new Scanner(System.in);

        // Создаем объект класса ThrowDemo
        ThrowDemo t = new ThrowDemo();

        // Считываем строку с клавиатуры и передаем её в метод printMessage
        t.printMessage(scanner.nextLine());
    }
}

