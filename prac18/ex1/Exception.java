package prac18.ex1;

public class Exception {
    public void exceptionDemo() {
       // System.out.println(2 / 0);
        // System.out.println(2.0 / 0.0);
    }
    public static void main(String[] args) {
        Exception ex = new Exception();
        ex.exceptionDemo();
    }
}

// при проигровании любого из вариантов мы получим сбой
// программа пытается выполнить деление на ноль, который он не в состоянии выполнить