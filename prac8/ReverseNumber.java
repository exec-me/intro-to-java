package prac8;
import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(reverse(n, 0));
        scanner.close();
    }

    private static int reverse(int n, int result) {
        if (n == 0) return result;
        return reverse(n / 10, result * 10 + n % 10);
    }
}
