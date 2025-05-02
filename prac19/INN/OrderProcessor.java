package prac19.INN;

import java.util.Scanner;

public class OrderProcessor {
    // Метод для проверки ИНН
    private boolean isValidINN(String inn) {
        if (inn == null || inn.length() != 12) {
            return false;
        }
        // Проверяем, что строка содержит только цифры
        return inn.matches("\\d+");
    }

    // Метод для оформления заказа
    public void processOrder(String fullName, String inn) throws InvalidINNException {
        if (!isValidINN(inn)) {
            throw new InvalidINNException("Недействительный ИНН: " + inn + ". ИНН должен быть 12-значным числом.");
        }
        System.out.println("Заказ оформлен для " + fullName + ", ИНН: " + inn);
    }

    public static void main(String[] args) {
        OrderProcessor processor = new OrderProcessor();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите ФИО: ");
        String fullName = scanner.nextLine();

        System.out.print("Введите ИНН (12 цифр): ");
        String inn = scanner.nextLine();

        try {
            processor.processOrder(fullName, inn);
        } catch (InvalidINNException e) {
            System.out.println("Ошибка: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
