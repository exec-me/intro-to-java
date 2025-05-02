package prac6.task8;

public class StringBuilderObserverTest {
    public static void main(String[] args) {
        CustomStringBuilder sb = new CustomStringBuilder();
        Logger logger = new Logger();
        sb.addObserver(logger);

        sb.append("Hello").append(", World!");
    }
}
