package prac17.ex2;


import java.util.Scanner;

public class main {
    public static void main(String[] args){
        Catalog catalog = new Catalog();
        Scanner scanner = new Scanner(System.in);
        String choice;
        do {
            catalog.addNode();
            System.out.print("Add another? (1 - yes, anything - no): ");
            choice = scanner.nextLine();
        } while (choice.equalsIgnoreCase("1"));

        System.out.println("Cart:");
        catalog.printC();
    }
}
