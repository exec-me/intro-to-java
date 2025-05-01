package prac2.task6;

public class CircleTest {
    public static void main(String[] args) {
        Circle c1 = new Circle(0, 0, 5, "Red");
        Circle c2 = new Circle(1, 1, 5, "Blue");
        System.out.println(c1);
        System.out.println("Area of c1: " + c1.getArea());
        System.out.println("Circum. of c2: " + c2.getArea());
        System.out.println("c1 is equal to c2: " + c1.equals(c2));
    }
}
