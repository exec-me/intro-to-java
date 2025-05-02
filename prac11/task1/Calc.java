package prac11.task1;

import java.util.Scanner;
class calc {
    public void func(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("1st num: ");
        double num1 = scanner.nextDouble();
        System.out.print("2nd num: ");
        double num2 = scanner.nextDouble();
        System.out.print("Operation (+, -, *, /): ");
        char operation = scanner.next().charAt(0);
        double result;
        switch (operation) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("ERR: dividing by zero.");
                    return;
                }
                break;
            default:
                System.out.println("ERR: wrong operation.");
                return;
        }
        System.out.println("Result: " + result);
        scanner.close();
    }
}