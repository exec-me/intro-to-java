package prac401.task1;

abstract class Shape {
    protected String color;
    protected boolean filled;

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public abstract String getType();

    public abstract double getArea();

    public abstract double getPerimeter();

    @Override
    public String toString() {
        return "Shape {type=" + getType() + ", color=" + color + ", filled=" + filled + "}";
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public String getType() {
        return "Circle";
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle {radius=" + radius + ", color=" + color + ", filled=" + filled + "}";
    }
}

class Rectangle extends Shape {
    private double width;
    private double length;

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    @Override
    public String getType() {
        return "Rectangle";
    }

    @Override
    public double getArea() {
        return width * length;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + length);
    }

    @Override
    public String toString() {
        return "Rectangle {width=" + width + ", length=" + length + ", color=" + color + ", filled=" + filled + "}";
    }
}

class Square extends Rectangle {
    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    @Override
    public String getType() {
        return "Square";
    }

    public double getSide() {
        return getWidth();
    }

    @Override
    public String toString() {
        return "Square {side=" + getSide() + ", color=" + color + ", filled=" + filled + "}";
    }
}