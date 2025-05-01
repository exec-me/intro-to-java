package prac2.task3;

public class Tester {
    private Circle[] circles;
    private int count;

    public Tester(int size) {
        circles = new Circle[size];
        count = 0;
    }

    public void addCircle(Circle circle) {
        if (count < circles.length) {
            circles[count++] = circle;
        }
    }

    public static void main(String[] args) {
        Tester tester = new Tester(3);
        tester.addCircle(new Circle(new Point(0, 0), 5));
        tester.addCircle(new Circle(new Point(3, 4), 2.5));
        tester.addCircle(new Circle(new Point(1.2, 3.4), 2.6));

        for (int i = 0; i < tester.count; i++) {
            System.out.println(tester.circles[i]);
        }
    }
}
