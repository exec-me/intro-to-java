package prac2.task2;

public class Ball {
    private double x;
    private double y;
    private double xSpeed;
    private double ySpeed;

    public Ball(double x, double y, double xSpeed, double ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setXSpeed(double xSpeed) {
        this.xSpeed = xSpeed;
    }

    public void setYSpeed(double ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void move() {
        x += xSpeed;
        y += ySpeed;
    }

    @Override
    public String toString() {
        return "Ball {x=" + x + ", y=" + y + ", xSpeed=" + xSpeed + ", ySpeed=" + ySpeed + "}";
    }
}
