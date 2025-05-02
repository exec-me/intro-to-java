package prac14;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LetterFrequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Text:");
        String text = scanner.nextLine().toLowerCase();

        Map<Character, Integer> frequency = new HashMap<>();

        for (char c : text.toCharArray()) {
            if (Character.isLetter(c)) {
                frequency.put(c, frequency.getOrDefault(c, 0) + 1);
            }
        }

        System.out.println("Freq.:");
        for (char c = 'a'; c <= 'z'; c++) {
            int count = frequency.getOrDefault(c, 0);
            if (count > 0) {
                System.out.println(c + ": " + count);
            }
        }
        scanner.close();
    }
}
