package prac8;
import java.util.Scanner;

public class PrintOdds {
    public static void main(String[] args) {
        printOdds();
    }

    private static void printOdds() {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if (num == 0) {
            scanner.close();
            return;
        }
        if (num % 2 != 0) {
            System.out.println(num);
        }
        printOdds();
    }
}