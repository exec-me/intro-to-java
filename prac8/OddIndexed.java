package prac8;
import java.util.Scanner;

public class OddIndexed {
    public static void main(String[] args) {
        printOddIndexed(true);
    }

    private static void printOddIndexed(boolean isOdd) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if (num == 0) {
            scanner.close();
            return;
        }
        if (isOdd) {
            System.out.println(num);
        }
        printOddIndexed(!isOdd);
    }
}
