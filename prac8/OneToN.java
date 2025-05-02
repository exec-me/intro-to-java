package prac8;
import java.util.Scanner;

public class OneToN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }

        scanner.close();
    }
}
