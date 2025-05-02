package prac14;
import java.util.Scanner;
import java.util.regex.Pattern;

public class SpecificStringCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("String to check");
        String input = scanner.nextLine();

        String regex = "^abcdefghijklmnopqrstuv18340$";
        boolean isMatch = Pattern.matches(regex, input);

        System.out.println(isMatch ? "YES" : "NO");

        scanner.close();
    }
}
