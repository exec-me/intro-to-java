package prac401.task8;

public class ShapeTest {
    public static void main(String[] args) {
        Shape s1 = new Circle(5.5, "RED", false);
        System.out.println("Area: " + s1.getArea()); // 95.03 (полиморфизм)
        System.out.println("Color: " + s1.getColor()); // RED

        // downcast check
        if (s1 instanceof Circle) {
            Circle c1 = (Circle)s1;
            System.out.println("Radius: " + c1.getRadius()); // 5.5
        }

        Shape s3 = new Rectangle(1.0, 2.0, "GREEN", true);
        System.out.println("Perimeter: " + s3.getPerimeter()); // 6.0
    }
}
