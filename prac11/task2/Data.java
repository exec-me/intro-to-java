package prac11.task2;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class Data {
    public Calendar datFunc(){
        SimpleDateFormat sdf = new SimpleDateFormat("EEEE,d MMMM, yyyy");
        Calendar cal = Calendar.getInstance();
        Scanner scanner = new Scanner(System.in);
        int year;
        do {
            System.out.print("Enter year (in format yyyy): ");
            while (!scanner.hasNextInt()) {
                scanner.next();
            }
            year = scanner.nextInt();
        } while (year < 1900 || year > 2100);

        int month;
        do {
            System.out.print("Enter month (1-12): ");
            while (!scanner.hasNextInt()) {
                scanner.next();
            }
            month = scanner.nextInt();
        } while (month < 1 || month > 12);

        int day;
        do {
            System.out.print("Enter day: ");
            while (!scanner.hasNextInt()) {
                scanner.next();
            }
            day = scanner.nextInt();
        } while (day < 1 || day > 31);

        cal.set(Calendar.YEAR,year);
        cal.set(Calendar.MONTH,month-1);
        cal.set(Calendar.DAY_OF_MONTH,day);
        System.out.println("You entered time:" + sdf.format(cal.getTime()));
        return cal;
    }
}
