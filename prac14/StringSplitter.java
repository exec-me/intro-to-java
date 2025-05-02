package prac14;
import java.util.Scanner;
import java.util.regex.Pattern;

public class StringSplitter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("String to split:");
        String input = scanner.nextLine();

        System.out.println("Choose splitter (1 - space, 2 - ',', 3 - your regex):");
        int choice = scanner.nextInt();
        scanner.nextLine();

        String regex;
        switch (choice) {
            case 1:
                regex = "\\s+";
                break;
            case 2:
                regex = ",";
                break;
            case 3:
                System.out.println("Enter regex:");
                regex = scanner.nextLine();
                break;
            default:
                System.out.println("Wrong input. Space will be used");
                regex = "\\s+";
        }

        String[] tokens = Pattern.compile(regex).split(input);

        System.out.println("Splitted string:");
        for (String token : tokens) {
            System.out.println(token.trim());
        }

        scanner.close();
    }
}
