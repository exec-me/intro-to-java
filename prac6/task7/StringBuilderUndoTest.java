package prac6.task7;

public class StringBuilderUndoTest {
    public static void main(String[] args) {
        CustomStringBuilder sb = new CustomStringBuilder();
        sb.append("Hello").append(", ").append("World!");
        System.out.println("After appends: " + sb);
        sb.undo();
        System.out.println("After undo: " + sb);
        sb.undo();
        System.out.println("After undo: " + sb);
    }
}