package prac7.task4;

import java.util.Scanner;

public class StringManipulatorTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringManipulator manipulator = new StringProcessor();

        System.out.print("Enter a string: ");
        String testString = scanner.nextLine();

        System.out.println("Original String: " + testString);
        System.out.println("Number of characters: " + manipulator.countCharacters(testString));
        System.out.println("Characters on odd positions: " + manipulator.getOddPositionCharacters(testString));
        System.out.println("Reversed String: " + manipulator.reverseString(testString));

        scanner.close();
    }
}