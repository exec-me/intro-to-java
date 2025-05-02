package prac8;
import java.util.Scanner;

public class MaxSequence {
    public static void main(String[] args) {
        System.out.println(findMax());
    }

    private static int findMax() {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if (num == 0) {
            scanner.close();
            return Integer.MIN_VALUE;
        }
        int max = findMax();
        return Math.max(num, max);
    }
}
