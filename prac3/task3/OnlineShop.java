package prac3.task3;

import java.util.Scanner;

public class OnlineShop {
    private static final double USD_TO_EUR = 0.85;
    private static final double USD_TO_RUB = 95;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Product name: ");
        String productName = scanner.nextLine();
        System.out.print("Product price in USD: ");
        double priceUSD = scanner.nextDouble();

        System.out.println("Currency (1 - USD, 2 - EUR, 3 - RUB): ");
        int currency = scanner.nextInt();

        System.out.printf("Product: %s%n", productName);
        switch (currency) {
            case 1: // USD
                System.out.printf("Amount: $%.2f USD%n", priceUSD);
                break;
            case 2: // EUR
                System.out.printf("Amount: €%.2f EUR%n", priceUSD * USD_TO_EUR);
                break;
            case 3: // RUB
                System.out.printf("Amount: ₽%.2f RUB%n", priceUSD * USD_TO_RUB);
                break;
            default:
                System.out.println("Wrong choice of currency!");
                return;
        }

        scanner.close();
    }
}
