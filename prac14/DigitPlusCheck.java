package prac14;
import java.util.Scanner;
import java.util.regex.Pattern;

public class DigitPlusCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Math input:");
        String input = scanner.nextLine();

        // (?!\\+\\b) shows if there is no "+" and \b after number
        String regex = "\\d(?!\\+\\b)";
        boolean hasInvalidDigit = Pattern.compile(regex).matcher(input).find();

        System.out.println(hasInvalidDigit ? "NO" : "YES");

        scanner.close();
    }
}
