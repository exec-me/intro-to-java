package prac401.task1;

public class ShapeTest {
    public static void main(String[] args) {
        Shape[] shapes = {
                new Circle(5.5, "RED", false),
                new Rectangle(1.0, 2.0, "BLUE", true),
                new Square(6.6, "GREEN", false)
        };

        for (Shape shape : shapes) {
            System.out.println(shape);
            System.out.println("Type: " + shape.getType());
            System.out.println("Area: " + shape.getArea());
            System.out.println("Perimeter: " + shape.getPerimeter());
            System.out.println("Color: " + shape.getColor());
            System.out.println("Filled: " + shape.isFilled());
            System.out.println();
        }
    }
}
