package prac2.task4;
import java.util.ArrayList;
import java.util.Scanner;

public class Shop {
    private ArrayList<Computer> computers;

    public Shop() {
        computers = new ArrayList<>();
    }

    public void addComputer(Computer computer) {
        computers.add(computer);
    }

    public void removeComputer(String model) {
        computers.removeIf(c -> c.getModel().equals(model));
    }

    public Computer findComputer(String model) {
        for (Computer c : computers) {
            if (c.getModel().equals(model)) {
                return c;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Shop shop = new Shop();
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many computers today: ");
        int n = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.print("Computer model: ");
            String model = scanner.nextLine();
            System.out.print("Computer price: ");
            int price = scanner.nextInt();
            scanner.nextLine();
            shop.addComputer(new Computer(model, price));
        }

        System.out.print("Enter model to find computer: ");
        String searchModel = scanner.nextLine();
        Computer found = shop.findComputer(searchModel);
        System.out.println(found != null ? found : "There is no such computer!");

        System.out.print("Enter model to delete computer: ");
        String removeModel = scanner.nextLine();
        shop.removeComputer(removeModel);

        System.out.println("All computers in shop:");
        for (Computer c : shop.computers) {
            System.out.println(c);
        }
        scanner.close();
    }
}
