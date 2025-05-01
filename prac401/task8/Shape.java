package prac401.task8;

abstract class Shape {
    private String color;
    private boolean filled;

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public abstract double getArea();
    public abstract double getPerimeter();
    public String getColor() { return color; }
    public boolean isFilled() { return filled; }
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    @Override
    public double getArea() { return Math.PI * radius * radius; }
    @Override
    public double getPerimeter() { return 2 * Math.PI * radius; }
    public double getRadius() { return radius; }
}

class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width, String color, boolean filled) {
        super(color, filled);
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() { return length * width; }
    @Override
    public double getPerimeter() { return 2 * (length + width); }
    public double getLength() { return length; }
}

class Square extends Rectangle {
    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() { return super.getLength(); }
}
