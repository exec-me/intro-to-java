package prac16;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MouseTracker extends JFrame {

    public MouseTracker() {
        setTitle("Greetings by districts");
        setSize(600, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel centerPanel = createAreaPanel("ЦАО");
        JPanel westPanel = createAreaPanel("ЗАО");
        JPanel eastPanel = createAreaPanel("ВАО");
        JPanel southPanel = createAreaPanel("ЮАО");
        JPanel northPanel = createAreaPanel("САО");

        add(centerPanel, BorderLayout.CENTER);
        add(westPanel, BorderLayout.WEST);
        add(eastPanel, BorderLayout.EAST);
        add(southPanel, BorderLayout.SOUTH);
        add(northPanel, BorderLayout.NORTH);

        westPanel.setPreferredSize(new Dimension(100, 0));
        eastPanel.setPreferredSize(new Dimension(100, 0));
        northPanel.setPreferredSize(new Dimension(0, 100));
        southPanel.setPreferredSize(new Dimension(0, 100));
    }

    private JPanel createAreaPanel(String areaName) {
        JPanel panel = new JPanel();

        panel.setOpaque(false);
        panel.setBackground(new Color(0, 0, 0, 0));

        panel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                showWelcomeMessage(areaName);
            }
        });

        return panel;
    }

    private void showWelcomeMessage(String areaName) {
        JOptionPane.showMessageDialog(
                this,
                "Welcome to " + areaName,
                "Hello",
                JOptionPane.INFORMATION_MESSAGE
        );
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            MouseTracker app = new MouseTracker();
            app.setVisible(true);
        });
    }
}