package prac2.task7;

public class BookShelf {
    private Book[] books;
    private int count;

    public BookShelf(int size) {
        books = new Book[size];
        count = 0;
    }

    public void addBook(Book book) {
        if (count < books.length) {
            books[count++] = book;
        }
    }

    public Book getEarliestBook() {
        if (count == 0) return null;
        Book earliest = books[0];
        for (int i = 1; i < count; i++) {
            if (books[i].getYear() < earliest.getYear()) {
                earliest = books[i];
            }
        }
        return earliest;
    }

    public Book getLatestBook() {
        if (count == 0) return null;
        Book latest = books[0];
        for (int i = 1; i < count; i++) {
            if (books[i].getYear() > latest.getYear()) {
                latest = books[i];
            }
        }
        return latest;
    }

    public void sortByYear() {
        // bubble sort
        for (int i = 0; i < count - 1; i++) {
            for (int j = 0; j < count - i - 1; j++) {
                if (books[j].getYear() > books[j + 1].getYear()) {
                    Book temp = books[j];
                    books[j] = books[j + 1];
                    books[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        BookShelf shelf = new BookShelf(3);
        shelf.addBook(new Book("Author1", "Book1", 3435));
        shelf.addBook(new Book("Author2", "Book2", 1995));
        shelf.addBook(new Book("Author3", "Book3", 2500));

        System.out.println("Earliest: " + shelf.getEarliestBook());
        System.out.println("Latest: " + shelf.getLatestBook());
        shelf.sortByYear();
        System.out.println("Sorted by year:");
        for (int i = 0; i < shelf.count; i++) {
            System.out.println(shelf.books[i]);
        }
    }
}
