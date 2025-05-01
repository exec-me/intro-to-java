package prac5.task3;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Scanner;

class GFG extends Frame {
    static Image img;

    Scanner sc = new Scanner(System.in);

    GFG() {
        System.out.print("Path to img: ");
        String imgPath = sc.nextLine();
        img = Toolkit.getDefaultToolkit().getImage(imgPath);

        MediaTracker track = new MediaTracker(this);
        track.addImage(img, 0);

        try {
            track.waitForID(0);
            if (track.isErrorID(0)) {
                System.out.println("Wrong path.");
                System.exit(1);
            }
        } catch (InterruptedException ae) {
            System.out.println("Error due loading: " + ae.getMessage());
            System.exit(1);
        }

        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    @Override
    public void paint(Graphics g) {
        g.drawImage(img, 150, 150, 200, 200, null);
    }

    public static void main(String[] args) {
        GFG g = new GFG();
        g.setSize(500, 500);
        g.setResizable(false);
        g.setIconImage(img);
        g.setVisible(true);
    }
}
