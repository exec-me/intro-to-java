package prac18.ex4;

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
        }finally {
            myScanner.close();
            System.out.println("Scanner closed.");
        }
    }

    public static void main(String[] args) {
        exc2 ex = new exc2();
        ex.exception();
    }
}

// Блок finally всегда выполняется, что гарантирует закрытие ресурса,
// даже если произошла ошибка