package prac3.task1.Circle;

import java.util.Random;

public class Circle {
    private double radius;
    private Point center;

    public Circle(Point center, double radius){
        this.radius = radius;
        this.center = center;
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public static double generateRandomRadius() {
        Random rnd = new Random();
        return rnd.nextDouble() * 10 + 1;
    }
    @Override
    public String toString(){
        return String.format("Radius: %f;\nX, Y: %f, %f", this.radius, this.center.getX(), this.center.getY());
    }
}
