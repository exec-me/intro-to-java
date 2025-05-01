package prac3.task1.mathrandom;

import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

public class EvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int n;
        do {
            System.out.print("Array length: ");
            while (!scanner.hasNextInt()) {
                System.out.println("This is not an integer.");
                scanner.next();
            }
            n = scanner.nextInt();
            if (n <= 0) {
                System.out.println("Length must be > 0");
            }
        } while (n <= 0);

        int[] array = new int[n];
        System.out.print("First array: ");
        for (int i = 0; i < n; i++) {
            array[i] = random.nextInt(n + 1);
            System.out.print(array[i] + " ");
        }

        ArrayList<Integer> evenList = new ArrayList<>();
        for (int num : array) {
            if (num % 2 == 0) {
                evenList.add(num);
            }
        }

        System.out.print("\nArray of even: ");
        if (evenList.isEmpty()) {
            System.out.println("There is no even numbers.");
        } else {
            for (int num : evenList) {
                System.out.print(num + " ");
            }
        }

        scanner.close();
    }
}
