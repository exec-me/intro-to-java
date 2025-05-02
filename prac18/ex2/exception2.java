package prac18.ex2;



import java.util.Scanner;

public class exception2 {
    public void exceptionDemo() {
        Scanner myScanner = new Scanner( System.in);
        System.out.print( "Enter an integer ");
        String intString = myScanner.next();
        int i = Integer.parseInt(intString);
        System.out.println( 2/i );
    }
    public static void main(String[] args) {
        exception2 ex = new exception2();
        ex.exceptionDemo();
    }
}

// Qwerty - прога завершится с ошибкой `NumberFormatException`, тк это не может быть преобразованно в int
// 0 - та же ошибка, что и exception1
// 1.2 - то же что и Qwerty
// 1 - проходит