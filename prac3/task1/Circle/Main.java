package prac3.task1.Circle;

public class Main {
    public static void main(String[] args) {
        Tester test = new Tester();

        for (int i = 0; i < 10; i++) {
            Point point = new Point(Math.random(), Math.random());
            double radius = Circle.generateRandomRadius();

            Circle circle = new Circle(point, radius);
            test.addCircle(circle);
        }

        for (Circle circle : test.circles){
            System.out.printf("%s\n", circle);
        }

        test.sortCirclesByRadius();

        System.out.println("\nAfter sorting:");
        for (Circle circle : test.circles) {
            System.out.printf("%s\n", circle);
        }

        Circle smallestCircle = test.findSmallestCircle();
        System.out.printf("Smallest circle: %s\n", smallestCircle);

        Circle largestCircle = test.findLargestCircle();
        System.out.printf("Largest circle: %s\n", largestCircle);
    }
}
