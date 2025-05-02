package prac12;

import javax.swing.*;
import java.awt.event.*;

class Slideshow extends JFrame {
    private JLabel imageLabel;
    private ImageIcon[] images;
    private int currentImageIndex = 0;
    private Timer timer;

    public Slideshow() {
        setTitle("Slideshow");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1200, 1200);

        String[] imagePaths = {

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
