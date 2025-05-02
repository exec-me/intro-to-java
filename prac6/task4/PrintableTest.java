package prac6.task4;

public class PrintableTest {
    public static void main(String[] args) {
        Printable[] printables = {
                new Book("1984", "George Orwell"),
                new Book("Dune", "Frank Herbert"),
                new Shop("Tech Store"),
                new Shop("Book Haven")
        };

        for (Printable p : printables) {
            p.print();
        }
    }
}
