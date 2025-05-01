package prac2.task8;
import java.util.Scanner;


public class StringReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Array length: ");
        int n = scanner.nextInt();
        scanner.nextLine();
        String[] array = new String[n];

        System.out.println("Array elements: ");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextLine();
        }

        for (int i = 0; i < n / 2; i++) {
            String temp = array[i];
            array[i] = array[n - 1 - i];
            array[n - 1 - i] = temp;
        }

        System.out.println("Result: ");
        for (String s : array) {
            System.out.println(s);
        }

        scanner.close();
    }
}
