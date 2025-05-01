package prac4.task3;

import java.util.Scanner;

public class OnlineStoreTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        OnlineStore store = new OnlineStore();

        while (!store.authenticate("user", "pass")) {
            System.out.print("Login: ");
            String login = scanner.nextLine();
            System.out.print("Password: ");
            String password = scanner.nextLine();
            store.authenticate(login, password);
        }

        while (true) {
            System.out.println("\n1. Show categories");
            System.out.println("2. Show products in category");
            System.out.println("3. Add to cart");
            System.out.println("4. Show cart");
            System.out.println("5. Buy cart");
            System.out.println("6. Exit");
            System.out.print("Choose what to do: ");

            int choice;
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Incorrect input!");
                continue;
            }

            switch (choice) {
                case 1:
                    store.displayCategories();
                    break;
                case 2:
                    System.out.print("Name of category: ");
                    String category = scanner.nextLine();
                    store.displayProductsByCategory(category);
                    break;
                case 3:
                    System.out.print("Name of product: ");
                    String productName = scanner.nextLine();
                    store.addToCart(productName);
                    break;
                case 4:
                    store.viewCart();
                    break;
                case 5:
                    store.checkout();
                    break;
                case 6:
                    System.out.println("Bye!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Incorrect choice!");
            }
        }
    }
}
