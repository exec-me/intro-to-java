package prac401.task5;

public class Test {
    public static void main(String[] args) {
        Reader[] readers = {
                new Reader("James", "123", "MSU", "11.11.1111", "+1234567890"),
                new Reader("Bobby", "456", "MIREA", "22.22.2222", "+0987654321")
        };

        Book book1 = new Book("Title1", "Auth1");
        Book book2 = new Book("Title2", "Auth2");
        Book book3 = new Book("Title3", "Auth3");

        // Тестирование методов
        readers[0].takeBook(3);
        readers[0].takeBook("Title1", "Title2", "Title3");
        readers[0].takeBook(book1, book2, book3);
        readers[0].returnBook(3);
        readers[0].returnBook("Title1", "Title2", "Title3");
        readers[0].returnBook(book1, book2, book3);

        readers[1].takeBook(2);
        readers[1].takeBook("Title4", "Title5");
        readers[1].returnBook(2);
    }
}
