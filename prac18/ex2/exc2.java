package prac18.ex2;


import java.util.Scanner;

public class exc2 {
    public void exception() {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        String intString = myScanner.next();
        try {
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid integer.");
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero.");
        }
    }

    public static void main(String[] args) {
        exc2 ex = new exc2();
        ex.exception();
    }
}

// Qwerty - прога  выведет сообщение Invalid input. Please enter a valid integer.
// 0 -  выведет сообщение Cannot divide by zero.
// 1.2 - то же что и Qwerty
// 1 - проходит
// в случае возникновения ошибок, программа информирует пользователя о проблеме вместо аварийного завершения