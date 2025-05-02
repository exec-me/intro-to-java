package prac8;
import java.util.Scanner;

public class DigitsRightToLeft {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        printDigits(n);
        scanner.close();
    }

    private static void printDigits(int n) {
        if (n == 0) return;
        System.out.print(n % 10 + " ");
        printDigits(n / 10);
    }
}
