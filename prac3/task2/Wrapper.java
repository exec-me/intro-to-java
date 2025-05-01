package prac3.task2;

public class Wrapper {
    public static void main(String[] args) {
        Double double1 = Double.valueOf(3.14);
        Double double2 = Double.valueOf("2.718");

        String str = "5.55";
        double parsedDouble = Double.parseDouble(str);

        // except boolean
        Double doubleObj = 10.99;
        byte byteValue = doubleObj.byteValue();
        short shortValue = doubleObj.shortValue();
        int intValue = doubleObj.intValue();
        long longValue = doubleObj.longValue();
        float floatValue = doubleObj.floatValue();
        double doubleValue = doubleObj.doubleValue();


        System.out.println("Value double1: " + double1);
        System.out.println("Value double2: " + double2);
        System.out.println("Parsed value: " + parsedDouble);

        System.out.println("Byte: " + byteValue);
        System.out.println("Short: " + shortValue);
        System.out.println("Int: " + intValue);
        System.out.println("Long: " + longValue);
        System.out.println("Float: " + floatValue);
        System.out.println("Double: " + doubleValue);

        double literal = 3.14;
        String doubleStr = Double.toString(literal);
        System.out.println("Double to string: " + doubleStr);
    }
}