package prac7.task5;

public class PrintableTest {
    public static void main(String[] args) {
        Printable[] printables = {
                new Book("1984", "George Orwell", 1949),
                new Magazine("Tech Weekly"),
                new Book("Dune", "Frank Herbert", 1965),
                new Magazine("Science Monthly")
        };

        System.out.println("All items:");
        for (Printable p : printables) {
            p.print();
        }

        System.out.println("\nBooks only:");
        Book.printBooks(printables);

        System.out.println("\nMagazines only:");
        Magazine.printMagazines(printables);
    }
}
