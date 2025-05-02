package prac6.task3;

public class PriceableTest {
    public static void main(String[] args) {
        Priceable[] items = {
                new Product("Laptop", 999.99),
                new Service("Consulting", 100.0),
                new Ticket("Concert", 50.0)
        };

        for (Priceable item : items) {
            System.out.println("Price: $" + item.getPrice());
        }
    }
}
