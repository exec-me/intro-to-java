import java.util.Scanner;

public class prac1t7 {
    public static long f(int n) {
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Factorial to calc: ");
        System.out.println("Result: " + f(scanner.nextInt()));
    }
}
