package prac17.ex1;

import java.util.InputMismatchException;
import java.util.Scanner;

class Node {
    String name;
    int age;
    Node next;

    public void readAt(){
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("Name: ");
                name = scanner.nextLine();
                if (name.isEmpty()) {
                    throw new IllegalArgumentException("Name is empty!");
                }
                break;
            } catch (Exception e) {
                System.out.println("ERR: " + e.getMessage());
            }
        }
        while (true){
            try {
                System.out.print("Age: ");
                age = scanner.nextInt();
                if (age < 0) {
                    throw new IllegalArgumentException("Age must be > 0!");
                }
                break;
            } catch (InputMismatchException e) {
                System.out.println("Must be an integer");
            }catch (IllegalArgumentException e) {
                System.out.println("ERR: " + e.getMessage());}
            scanner.nextLine();
        }
    }

    public void printAt(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
