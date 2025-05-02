package prac8;
import java.util.Scanner;

public class DigitSumCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int s = scanner.nextInt();

        int count = 0;
        int min = (int) Math.pow(10, k - 1);
        int max = (int) Math.pow(10, k) - 1;

        for (int num = min; num <= max; num++) {
            if (sumDigits(num) == s) {
                count++;
            }
        }

        System.out.println(count);
        scanner.close();
    }

    private static int sumDigits(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}
