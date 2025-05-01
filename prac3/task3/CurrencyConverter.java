package prac3.task3;

import java.util.Scanner;

public class CurrencyConverter {
    private static final double USD_TO_EUR = 0.85;
    private static final double USD_TO_RUB = 95;
    private static final double EUR_TO_RUB = USD_TO_RUB / USD_TO_EUR;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Amount to convert: ");
        double amount = scanner.nextDouble();

        System.out.println("Currency (1 - USD, 2 - EUR, 3 - RUB): ");
        int currency = scanner.nextInt();

        switch (currency) {
            case 1: // USD
                System.out.printf("Amount in USD: %.2f%n", amount);
                System.out.printf("Amount in EUR: %.2f%n", amount * USD_TO_EUR);
                System.out.printf("Amount in RUB: %.2f%n", amount * USD_TO_RUB);
                break;
            case 2: // EUR
                System.out.printf("Amount in USD: %.2f%n", amount / USD_TO_EUR);
                System.out.printf("Amount in EUR: %.2f%n", amount);
                System.out.printf("Amount in RUB: %.2f%n", amount * EUR_TO_RUB);
                break;
            case 3: // RUB
                System.out.printf("Amount in USD: %.2f%n", amount / USD_TO_RUB);
                System.out.printf("Amount in EUR: %.2f%n", amount / EUR_TO_RUB);
                System.out.printf("Amount in RUB: %.2f%n", amount);
                break;
            default:
                System.out.println("Wrong choice of currency!");
        }
        scanner.close();
    }
}
