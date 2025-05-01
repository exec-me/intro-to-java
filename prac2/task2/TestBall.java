package prac2.task2;

public class TestBall {
    public static void main(String[] args) {
        Ball ball = new Ball(0.0, 0.0, 5.0, 5.0);
        System.out.println(ball);
        ball.move();
        System.out.println("Ball moved: " + ball);
        ball.setXSpeed(4.0);
        ball.move();
        System.out.println("Ball slowed and moved: " + ball);
    }
}
