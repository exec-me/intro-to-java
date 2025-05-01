package prac3.task1.Circle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Tester {
    private int count;
    protected List<Circle> circles;

    public Tester() {
        circles = new ArrayList<>();
        count = 0;
    }

    public void addCircle(Circle circle) {
        circles.add(circle);
        count++;
    }

    public void sortCirclesByRadius() {
        Collections.sort(circles, (c1, c2) -> Double.compare(c1.getRadius(), c2.getRadius()));
    }

    public Circle findSmallestCircle() {
        if (count == 0) {
            System.out.println("no circles");
        }
        return circles.stream().min((c1, c2) -> Double.compare(c1.getRadius(), c2.getRadius())).get();
    }

    public Circle findLargestCircle() {
        if (count == 0) {
            System.out.println("no circles");
        }
        return circles.stream().max((c1, c2) -> Double.compare(c1.getRadius(), c2.getRadius())).get();
    }
}
