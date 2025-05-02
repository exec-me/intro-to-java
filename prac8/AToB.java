package prac8;
import java.util.Scanner;

public class AToB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (a < b) {
            for (int i = a; i <= b; i++) {
                System.out.print(i + " ");
            }
        } else {
            for (int i = a; i >= b; i--) {
                System.out.print(i + " ");
            }
        }
        scanner.close();
    }
}
