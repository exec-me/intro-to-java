package prac14;
import java.util.Scanner;
import java.util.regex.Pattern;

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Password:");
        String input = scanner.nextLine();

        // ^ — start string
        // (?=.*[A-Z]) — at least one big letter
        // (?=.*[a-z]) — at least one little letter
        // (?=.*\\d) — at least one number
        // [A-Za-z\\d_]{8,} — only letters, numbers and "_", length >= 8
        // $ — end string
        String regex = "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)[A-Za-z\\d_]{8,}$";
        boolean isValid = Pattern.matches(regex, input);

        System.out.println(isValid ? "YES" : "NO");

        scanner.close();
    }
}
