package prac12;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Scanner;

class GFG extends Frame {
    static Image img;
    GFG() {
        Scanner sc = new Scanner(System.in);
        String imgpath = sc.next();
        img = Toolkit.getDefaultToolkit().getImage(imgpath);

        MediaTracker track = new MediaTracker(this);

        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        track.addImage(img, 0);
    }

    public void paint(Graphics g){
        g.drawImage(img,150,150,200,200,null);
    }

    public  static void main(String[] args){

        GFG g = new GFG();
        g.setSize(500,500);

        g.setResizable(false);
        g.setIconImage(img);
        g.setVisible(true);

    }

}
