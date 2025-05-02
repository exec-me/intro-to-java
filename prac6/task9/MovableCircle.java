package prac6.task9;

class MovableCircle extends MovablePoint {
    private int radius;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        super(x, y, xSpeed, ySpeed);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }
}
