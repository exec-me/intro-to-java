package prac6.task9;

import javax.swing.*;
import java.awt.*;

public class MovableCircleGUI extends JFrame {
    private MovableCircle circle;

    public MovableCircleGUI() {
        setTitle("Movable Circle");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);

        circle = new MovableCircle(200, 200, 10, 10, 20);

        // Панель для рисования
        JPanel canvas = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.setColor(Color.BLUE);
                g.fillOval(circle.x - circle.getRadius(), circle.y - circle.getRadius(),
                        2 * circle.getRadius(), 2 * circle.getRadius());
            }
        };
        add(canvas);

        // Кнопки управления
        JButton upButton = new JButton("Up");
        JButton downButton = new JButton("Down");
        JButton leftButton = new JButton("Left");
        JButton rightButton = new JButton("Right");

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(upButton);
        buttonPanel.add(downButton);
        buttonPanel.add(leftButton);
        buttonPanel.add(rightButton);
        add(buttonPanel, BorderLayout.SOUTH);

        // Обработчики кнопок
        upButton.addActionListener(e -> {
            circle.moveUp();
            canvas.repaint();
        });
        downButton.addActionListener(e -> {
            circle.moveDown();
            canvas.repaint();
        });
        leftButton.addActionListener(e -> {
            circle.moveLeft();
            canvas.repaint();
        });
        rightButton.addActionListener(e -> {
            circle.moveRight();
            canvas.repaint();
        });

        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new MovableCircleGUI().setVisible(true));
    }
}
