package prac2.task6;

public class Circle {
    private double x, y, r;
    private String colour;

    public Circle(double x, double y, double r, String colour) {
        this.x = x;
        this.y = y;
        this.r = r;
        this.colour = colour;
    }

    public double getR() { return r; }
    public void setR(double r) { this.r = r; }
    public double getCircumference() { return 2 * Math.PI * r; }
    public double getArea() { return Math.PI * r * r; }
    public boolean equals(Circle other) { return Math.abs(this.r - other.r) < 0.0001; }

    @Override
    public String toString() {
        return "Circle {x=" + x + ", y=" + y + ", r=" + r + ", colour='" + colour + "'}";
    }
}
