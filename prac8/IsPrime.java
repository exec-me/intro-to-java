package prac8;
import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(isPrime(n, 2) ? "YES" : "NO");
        scanner.close();
    }

    private static boolean isPrime(int n, int divisor) {
        if (divisor * divisor > n) return true;
        if (n % divisor == 0) return false;
        return isPrime(n, divisor + 1);
    }
}
