package prac14;
import java.util.Scanner;
import java.util.regex.Pattern;

public class DateValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter date (dd/mm/yyyy):");
        String input = scanner.nextLine();

        String regex = "^(0[1-9]|[12]\\d|3[01])/" +  // day
                "(0[1-9]|1[0-2])/" +          // month
                "(19\\d{2}|[2-9]\\d{3})$";    // year

        boolean isValid = Pattern.matches(regex, input);

        System.out.println(isValid ? "YES" : "NO");

        scanner.close();
    }
}
