package prac13.task5;

public class PhoneFormatter {

    public String formatPhoneNumber(String input) {
        // delete spaces, not numbers
        String cleanedInput = input.replaceAll("[^\\\\d+]", "");
        String countryCode;
        String phoneNumber;

        if (cleanedInput.startsWith("+")) {
            // +(country code)(number)
            int countryCodeEndIndex = 0;
            while (countryCodeEndIndex < cleanedInput.length() && Character.isDigit(cleanedInput.charAt(countryCodeEndIndex))) {
                countryCodeEndIndex++;
            }
            countryCode = cleanedInput.substring(0, countryCodeEndIndex);
            phoneNumber = cleanedInput.substring(countryCodeEndIndex);
        } else if (cleanedInput.startsWith("8")) {
            // 8(number)
            countryCode = "+7";
            phoneNumber = cleanedInput.substring(1);
        } else {
            return "wrong format.";
        }

        if (phoneNumber.length() != 10) {
            return "wrong format.";
        }

        String formattedNumber = String.format("%s%s-%s-%s", countryCode,
                phoneNumber.substring(0, 3),
                phoneNumber.substring(3, 6),
                phoneNumber.substring(6, 10));

        return formattedNumber;
    }

    public static void main(String[] args) {
        PhoneFormatter formatter = new PhoneFormatter();

        System.out.println(formatter.formatPhoneNumber("+79175655655")); // +7 917-565-5655
        System.out.println(formatter.formatPhoneNumber("89175655655"));  // +7 917-565-5655
        System.out.println(formatter.formatPhoneNumber("+104289652211")); // +10 428-965-2211
        System.out.println(formatter.formatPhoneNumber("123456789")); // wrong format.
        System.out.println(formatter.formatPhoneNumber("8917abc45def")); // wrong format.
    }
}
