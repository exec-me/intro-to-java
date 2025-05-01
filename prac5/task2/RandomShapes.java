package prac5.task2;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class RandomShapes extends JFrame {
    private Shape[] shapes;

    public RandomShapes() {
        setTitle("Random Shapes");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 400);
        shapes = new Shape[20];
        Random rand = new Random();

        for (int i = 0; i < shapes.length; i++) {
            int x = rand.nextInt(500) + 50;
            int y = rand.nextInt(300) + 50;
            Color color = new Color(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256));
            if (rand.nextBoolean()) {
                int radius = rand.nextInt(30) + 20;
                shapes[i] = new Circle(color, x, y, radius);
            } else {
                int width = rand.nextInt(60) + 20;
                int height = rand.nextInt(60) + 20;
                shapes[i] = new Rectangle(color, x, y, width, height);
            }
        }

        setLocationRelativeTo(null);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        for (Shape shape : shapes) {
            shape.draw(g);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new RandomShapes().setVisible(true);
        });
    }
}
