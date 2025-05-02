package prac6.task1;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MovablePoint point = new MovablePoint(5, 10, 0, 0);
        System.out.println(point);
        int pointX, pointY;
        do {
            System.out.print("X, Y speeds for point: ");
            pointX = scanner.nextInt();
            pointY = scanner.nextInt();
        } while ((pointX < 0)||(pointY<0));
        point = new MovablePoint(5, 10, pointX, pointY);
        System.out.println(point);

        System.out.print("Choose direction (1-up, 2-down, 3-left, 4-right): ");
        String pointDirection = scanner.next();
        switch (pointDirection.toLowerCase()) {
            case "1":
                point.moveUp(); break;
            case "2":
                point.moveDown(); break;
            case "3":
                point.moveLeft(); break;
            case "4":
                point.moveRight(); break;
            default:
                System.out.println("Wrong direction");
        }
        System.out.println(point);

        MovableCircle circle = new MovableCircle(3, 4, 1, 1, 5);
        System.out.println(circle);
        int cirX, cirY, r;
        do {
            System.out.print("X, Y speeds for circle: ");
            cirX = scanner.nextInt();
            cirY = scanner.nextInt();
        } while ((cirX < 0)||(cirY<0));
        do {
            System.out.print("Circe radius: ");
            r = scanner.nextInt();
        }while (r < 0);
        circle = new MovableCircle(3, 4, cirX, cirY, r);
        System.out.println(circle);
        System.out.print("Choose direction (1-up, 2-down, 3-left, 4-right): ");
        String circleDirection = scanner.next();
        switch (circleDirection.toLowerCase()) {
            case "1":
                circle.moveUp(); break;
            case "2":
                circle.moveDown(); break;
            case "3":
                circle.moveLeft(); break;
            case "4":
                circle.moveRight(); break;
            default:
                System.out.println("Wrong direction");
        }
        System.out.println(circle);
        scanner.close();
    }
}
