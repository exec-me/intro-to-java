package prac5.task4;

import javax.swing.*;
import java.awt.event.*;

public class Slideshow extends JFrame {
    private JLabel imageLabel;
    private ImageIcon[] images;
    private int currentImageIndex = 0;
    private Timer timer;

    public Slideshow() {
        setTitle("Slideshow");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1200, 1200);

        String[] imagePaths = {
                "C:\\Users\\mementomori\\Desktop\\ВУЗ\\3 sem\\Java uni\\intro-to-java\\prac5\\task4\\sahur.png",
                "C:\\Users\\mementomori\\Desktop\\ВУЗ\\3 sem\\Java uni\\intro-to-java\\prac5\\task4\\images.jpg"
        };

        images = new ImageIcon[imagePaths.length];
        {
            for (int i = 0; i < imagePaths.length; i++) {
                images[i] = new ImageIcon(imagePaths[i]);
            }
        }

        imageLabel = new JLabel(images[0]);
        add(imageLabel);

        timer = new Timer(1500, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                currentImageIndex = (currentImageIndex + 1) % images.length;
                imageLabel.setIcon(images[currentImageIndex]);
            }
        });
        timer.start();

        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new Slideshow().setVisible(true);
        });
    }
}