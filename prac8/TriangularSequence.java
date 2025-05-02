package prac8;
import java.util.Scanner;

public class TriangularSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int current = 1;
        int count = 0;
        for (int i = 1; count < n; i++) {
            if (i <= current) {
                System.out.print(current + " ");
                count++;
            } else {
                current++;
                i = 1;
                if (count < n) {
                    System.out.print(current + " ");
                    count++;
                }
            }
        }
        scanner.close();
    }
}
