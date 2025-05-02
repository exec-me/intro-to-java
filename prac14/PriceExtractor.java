package prac14;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PriceExtractor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Text with prices:");
        String input = scanner.nextLine();

        // \d+ — integer part
        // \. — splitter
        // \d{2} — fractional part
        // \s* — >=0 spaces
        // (USD|RUB|EUR) — currency
        // \b — end of word
        String regex = "\\d+\\.\\d{2}\\s*(USD|RUB|EUR)\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        System.out.println("Found prices:");
        while (matcher.find()) {
            System.out.println(matcher.group());
        }

        scanner.close();
    }
}