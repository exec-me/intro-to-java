package prac7.task2;


public class MovableRectangle implements Movable {
    private MovablePoint topLeft;
    private MovablePoint bottomRight;

    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
        topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
        bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
        if (!speedTest()) {
            throw new IllegalArgumentException("pts must be the same speed");
        }
    }

    public boolean speedTest() {
        return topLeft.getXSpeed() == bottomRight.getXSpeed() &&
                topLeft.getYSpeed() == bottomRight.getYSpeed();
    }

    @Override
    public void moveUp() {
        topLeft.moveUp();
        bottomRight.moveUp();
    }

    @Override
    public void moveDown() {
        topLeft.moveDown();
        bottomRight.moveDown();
    }

    @Override
    public void moveLeft() {
        topLeft.moveLeft();
        bottomRight.moveLeft();
    }

    @Override
    public void moveRight() {
        topLeft.moveRight();
        bottomRight.moveRight();
    }

    @Override
    public String toString() {
        return "MovableRectangle[topLeft=" + topLeft + ", bottomRight=" + bottomRight + "]";
    }

    public static void main(String[] args) {
        try {
            MovableRectangle rect = new MovableRectangle(0, 10, 20, 0, 5, 5);
            System.out.println("Rectangle: " + rect);
            System.out.println("Speed test: " + rect.speedTest());

            rect.moveRight();
            System.out.println("After moveRight: " + rect);
        } catch (IllegalArgumentException e) {
            System.out.println("ERR: " + e.getMessage());
        }
    }
}

