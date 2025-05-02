package prac8;
import java.util.Scanner;

public class NoTwoZeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(countSequences(a, b));
        scanner.close();
    }

    private static long countSequences(int a, int b) {
        if (a == 0) return b >= 0 ? 1 : 0;
        if (b == 0) return a <= 1 ? 1 : 0;
        return countSequences(a - 1, b - 1) + countSequences(a, b - 1);
    }
}