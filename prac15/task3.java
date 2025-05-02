package prac15;

import javax.swing.*;
import java.awt.*;


public class task3 extends JFrame {
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            JFrame frame = new JFrame("Buttons");

            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setResizable(false);

            // control panel, for future
            JPanel controls = new JPanel(new GridBagLayout());
            JPanel buttons = new JPanel(new GridBagLayout());

            GridBagConstraints gbc = new GridBagConstraints();
            gbc.insets = new Insets(5, 5, 5, 5);
            gbc.gridx = 0;
            gbc.gridy = 0;

            JMenuBar bar = new JMenuBar();

            JMenu file = new JMenu("File");
            JMenuItem save = new JMenuItem("Save");
            JMenuItem exit = new JMenuItem("Exit");
            file.add(save);
            file.add(exit);
            bar.add(file);

            JMenu edit = new JMenu("Edit");
            JMenuItem copy = new JMenuItem("Copy");
            JMenuItem virezat = new JMenuItem("Cut");
            JMenuItem paste = new JMenuItem("Paste");
            edit.add(copy);
            edit.add(virezat);
            edit.add(paste);
            bar.add(edit);

            JMenu help = new JMenu("Help");
            JMenuItem helpItem = new JMenuItem("Help me please");
            help.add(helpItem);
            bar.add(help);

            save.addActionListener(e -> JOptionPane.showMessageDialog(frame, "Saving."));
            exit.addActionListener(e -> System.exit(0));
            copy.addActionListener(e -> JOptionPane.showMessageDialog(frame, "Copying."));
            virezat.addActionListener(e -> JOptionPane.showMessageDialog(frame, "Cutting."));
            paste.addActionListener(e -> JOptionPane.showMessageDialog(frame, "Pasting."));
            helpItem.addActionListener(e -> JOptionPane.showMessageDialog(frame, "Helping."));

            JButton b1 = new JButton("btn1");
            gbc.gridy = 0;
            buttons.add(b1, gbc);
            b1.addActionListener(e -> JOptionPane.showMessageDialog(frame, "btn1 pressed"));

            JButton b2 = new JButton("btn2");
            gbc.gridy = 1;
            buttons.add(b2, gbc);
            b2.addActionListener(e -> JOptionPane.showMessageDialog(frame, "btn2 pressed"));

            frame.setJMenuBar(bar);

            frame.add(buttons, BorderLayout.CENTER);

            frame.setSize(300, 300);
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }
}
