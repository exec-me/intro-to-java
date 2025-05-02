package prac8;
import java.util.Scanner;

public class PrimeFactors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        factorize(n, 2);
        scanner.close();
    }

    private static void factorize(int n, int divisor) {
        if (n == 1) return;
        if (n % divisor == 0) {
            System.out.print(divisor + " ");
            factorize(n / divisor, divisor);
        } else {
            factorize(n, divisor + 1);
        }
    }
}