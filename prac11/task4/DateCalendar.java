package prac11.task4;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class DateCalendar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int year;
        do {
            System.out.print("Enter year (in format yyyy): ");
            while (!scanner.hasNextInt()) {
                scanner.next();
                System.out.print("Incorrect input, try again: ");
            }
            year = scanner.nextInt();
        } while (year < 1900 || year > 2100);

        int month;
        do {
            System.out.print("Enter month (1-12): ");
            while (!scanner.hasNextInt()) {
                scanner.next();
                System.out.print("Incorrect input, try again: ");
            }
            month = scanner.nextInt();
        } while (month < 1 || month > 12);

        int day;
        do {
            System.out.print("Enter day: ");
            while (!scanner.hasNextInt()) {
                scanner.next();
                System.out.print("Incorrect input, try again: ");
            }
            day = scanner.nextInt();
        } while (day < 1 || day > 31);

        int hours;
        do {
            System.out.print("Enter hours (0-23): ");
            while (!scanner.hasNextInt()) {
                scanner.next();
                System.out.print("Incorrect input, try again: ");
            }
            hours = scanner.nextInt();
        } while (hours < 0 || hours > 23);

        int minutes;
        do {
            System.out.print("Enter minutes (0-59): ");
            while (!scanner.hasNextInt()) {
                scanner.next();
                System.out.print("Incorrect input, try again: ");
            }
            minutes = scanner.nextInt();
        } while (minutes < 0 || minutes > 59);

        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.MONTH, month - 1); // starts from zero
        calendar.set(Calendar.DAY_OF_MONTH, day);
        calendar.set(Calendar.HOUR_OF_DAY, hours);
        calendar.set(Calendar.MINUTE, minutes);
        calendar.set(Calendar.SECOND, 0);

        if (calendar.get(Calendar.MONTH) != (month - 1)) {
            System.out.println("ERR: Incorrect date for that month.");
        } else {
            Date date = calendar.getTime();
            System.out.println("Calendar (obj):");
            System.out.println(calendar.getTime());
            System.out.println("Date (obj):");
            System.out.println(date);
        }

        scanner.close();
    }
}

