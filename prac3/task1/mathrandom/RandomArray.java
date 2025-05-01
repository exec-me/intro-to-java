package prac3.task1.mathrandom;

import java.util.Arrays;
import java.util.Random;

public class RandomArray {
    public static void main(String[] args) {
        int size = 10;
        double[] arrayMath = new double[size];
        double[] arrayRandom = new double[size];
        Random random = new Random();

        System.out.println("Array with Math.random():");
        for (int i = 0; i < size; i++) {
            arrayMath[i] = Math.random() * 100;
            System.out.printf("%.2f ", arrayMath[i]);
        }

        Arrays.sort(arrayMath);
        System.out.println("\nArray with Math.random() sorted:");
        for (double num : arrayMath) {
            System.out.printf("%.2f ", num);
        }

        System.out.println("\n");

        System.out.println("Array with Random:");
        for (int i = 0; i < size; i++) {
            arrayRandom[i] = random.nextDouble() * 100;
            System.out.printf("%.2f ", arrayRandom[i]);
        }

        Arrays.sort(arrayRandom);
        System.out.println("\nArray with Random sorted:");
        for (double num : arrayRandom) {
            System.out.printf("%.2f ", num);
        }
    }
}
