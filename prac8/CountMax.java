package prac8;
import java.util.Scanner;

public class CountMax {
    public static void main(String[] args) {
        System.out.println(countMax());
    }

    private static int[] countMax() {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        if (num == 0) {
            scanner.close();
            return new int[]{0, 0};
        }

        int[] result = countMax();
        int max = result[0];
        int count = result[1];

        if (num > max) {
            return new int[]{num, 1};
        } else if (num == max) {
            return new int[]{max, count + 1};
        } else {
            return new int[]{max, count};
        }
    }
}
