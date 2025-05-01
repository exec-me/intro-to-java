package prac3.task1.mathrandom;

import java.util.Random;

public class IncreasingSequence {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[4];

        System.out.print("Array: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(90) + 10;
            System.out.print(array[i] + " ");
        }

        boolean isIncreasing = true;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] >= array[i + 1]) {
                isIncreasing = false;
                break;
            }
        }

        System.out.println("\nArray " + (isIncreasing ? "is" : "is not") + " increasing series.");
    }
}
