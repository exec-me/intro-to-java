package prac8;
import java.util.Scanner;

public class DigitsLeftToRight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        printDigits(n);
        scanner.close();
    }

    private static void printDigits(int n) {
        if (n < 10) {
            System.out.print(n + " ");
            return;
        }
        printDigits(n / 10);
        System.out.print(n % 10 + " ");
    }
}
