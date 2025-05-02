package prac12;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

abstract class Shape {
    protected Color color;
    protected int x, y;

    public Shape(Color color, int x, int y) {
        this.color = color;
        this.x = x;
        this.y = y;
    }

    public abstract void draw(Graphics g);
}


class Circle extends Shape {
    private int radius;

    public Circle(Color color, int x, int y, int radius) {
        super(color, x, y);
        this.radius = radius;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(color);
        g.fillOval(x, y, radius * 2, radius * 2);
    }
}


class Rectangle extends Shape {
    private int width, height;

    public Rectangle(Color color, int x, int y, int width, int height) {
        super(color, x, y);
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(color);
        g.fillRect(x, y, width, height);
    }
}
class ShapePanel extends JPanel {
    private final ArrayList<Shape> shapes = new ArrayList<>();

    public void addShape(Shape shape) {
        shapes.add(shape);
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (Shape shape : shapes) {
            shape.draw(g);
        }
    }
}

class ButtonPanel extends JPanel {
    public ButtonPanel(ShapePanel shapePanel){
        JButton button = new JButton("Generate figure");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                shapePanel.addShape(GenerateShape());
            }
        });
        add(button);

        JButton buttonTwenty = new JButton("20 figures");
        buttonTwenty.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for (int i = 0; i < 20; i++) {
                    shapePanel.addShape(GenerateShape());
                }
            }
        });
        add(buttonTwenty);
    }

    private Shape GenerateShape(){
        Random rand = new Random();
        int x = rand.nextInt(500);
        int y = rand.nextInt(500);
        Color color = new Color(rand.nextInt(256),rand.nextInt(256),rand.nextInt(256));
        if (rand.nextBoolean()) {
            int radius = rand.nextInt(20,50);
            return new Circle(color, x, y, radius);
        } else {
            int width = rand.nextInt(20,80);
            int height = rand.nextInt(20,80);
            return new Rectangle(color, x, y, width, height);
        }
    }
}


class RandomShapes {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Random figures");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLocationRelativeTo(null);

        frame.setLayout(new BorderLayout());

        ShapePanel shapePanel = new ShapePanel();
        frame.getContentPane().add(shapePanel, BorderLayout.CENTER);

        ButtonPanel buttonPanel = new ButtonPanel(shapePanel);
        frame.getContentPane().add(buttonPanel, BorderLayout.SOUTH);

        frame.setVisible(true);
    }
}
