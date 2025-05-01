package prac2.task1;

public class TestAuthor {
    public static void main(String[] args) {
        Author author = new Author("Hermann Gesse", "herges@example.com", 'M');
        System.out.println(author);
        System.out.println("Author name: " + author.getName());
    }
}
