import java.util.Scanner;

public class prac1t4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Array length: ");
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        System.out.print("Array elements with spaces between them: ");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        int s = 0;
        int i = 0;
        do {
            s += numbers[i];
            i++;
        } while (i < numbers.length);

        System.out.println("Do while sum: " + s);
        s = 0;
        i = 0;
        while (i < numbers.length) {
            s += numbers[i];
            i++; // Увеличение счетчика
        }
        System.out.println("While sum: " + s);

        int max = numbers[0];
        int min = numbers[0];
        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
            if (number < min) {
                min = number;
            }
        }
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }
}