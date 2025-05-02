package prac7.task1;

public class MovableRectangleTest {
    public static void main(String[] args) {
        MovableRectangle rect = new MovableRectangle(1, 5, 10, 1, 2, 2);
        System.out.println("Initial: " + rect);
        rect.moveLeft();
        System.out.println("After moveLeft: " + rect);
        rect.moveDown();
        System.out.println("After moveDown: " + rect);
    }
}
