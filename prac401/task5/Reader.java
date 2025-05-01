package prac401.task5;

public class Reader {
    private String fullName;
    private String ticketNumber;
    private String faculty;
    private String birthDate;
    private String phone;

    public Reader(String fullName, String ticketNumber, String faculty, String birthDate, String phone) {
        this.fullName = fullName;
        this.ticketNumber = ticketNumber;
        this.faculty = faculty;
        this.birthDate = birthDate;
        this.phone = phone;
    }

    public void takeBook(int count) {
        System.out.println(fullName + " took " + count + " books");
    }

    public void takeBook(String... bookTitles) {
        System.out.print(fullName + " took books: ");
        for (int i = 0; i < bookTitles.length; i++) {
            System.out.print(bookTitles[i]);
            if (i < bookTitles.length - 1) System.out.print(", ");
        }
        System.out.println();
    }

    public void takeBook(Book... books) {
        System.out.print(fullName + " took books: ");
        for (int i = 0; i < books.length; i++) {
            System.out.print(books[i]);
            if (i < books.length - 1) System.out.print(", ");
        }
        System.out.println();
    }

    public void returnBook(int count) {
        System.out.println(fullName + " returned " + count + " books");
    }

    public void returnBook(String... bookTitles) {
        System.out.print(fullName + " returned books: ");
        for (int i = 0; i < bookTitles.length; i++) {
            System.out.print(bookTitles[i]);
            if (i < bookTitles.length - 1) System.out.print(", ");
        }
        System.out.println();
    }

    public void returnBook(Book... books) {
        System.out.print(fullName + " returned books: ");
        for (int i = 0; i < books.length; i++) {
            System.out.print(books[i]);
            if (i < books.length - 1) System.out.print(", ");
        }
        System.out.println();
    }
}
