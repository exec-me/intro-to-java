package prac8;
import java.util.Scanner;

public class CountOnes {
    public static void main(String[] args) {
        System.out.println(countOnes());
    }

    private static int countOnes() {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if (num == 0) {
            int next = scanner.nextInt();
            if (next == 0) {
                scanner.close();
                return 0;
            }
            return countOnes();
        }
        return (num == 1 ? 1 : 0) + countOnes();
    }
}
