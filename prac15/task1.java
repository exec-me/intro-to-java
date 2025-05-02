package prac15;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Calc extends JFrame {
    JPanel[] pnl = new JPanel[6];
    JTextField jta1 = new JTextField(10);
    JTextField jta2 = new JTextField(10);
    JButton addButton = new JButton("Add them up");
    JButton subButton = new JButton("Subtract them up");
    JButton multButton = new JButton("Multiply them up");
    JButton divButton = new JButton("Divide them up");

    Calc() {
        super("Calculator");
        setLayout(new GridLayout(2, 3));

        for (int i = 0; i < pnl.length; i++) {
            pnl[i] = new JPanel();
            add(pnl[i]);
        }

        pnl[0].setLayout(new BorderLayout());
        pnl[2].setLayout(new BorderLayout());
        pnl[4].setLayout(new FlowLayout());

        pnl[0].add(new JLabel("1st Number"), BorderLayout.CENTER);
        pnl[0].add(jta1, BorderLayout.SOUTH);

        pnl[2].add(new JLabel("2nd Number"), BorderLayout.CENTER);
        pnl[2].add(jta2, BorderLayout.SOUTH);

        pnl[4].add(addButton);
        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                try {
                    double x1 = Double.parseDouble(jta1.getText().trim());
                    double x2 = Double.parseDouble(jta2.getText().trim());
                    JOptionPane.showMessageDialog(null, "Result = " + (x1 + x2), "Alert", JOptionPane.INFORMATION_MESSAGE);
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Error in Numbers!", "Alert", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        pnl[4].add(subButton);
        subButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                try {
                    double x1 = Double.parseDouble(jta1.getText().trim());
                    double x2 = Double.parseDouble(jta2.getText().trim());
                    JOptionPane.showMessageDialog(null, "Result = " + (x1 - x2), "Alert", JOptionPane.INFORMATION_MESSAGE);
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Error in Numbers!", "Alert", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        pnl[4].add(multButton);
        multButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                try {
                    double x1 = Double.parseDouble(jta1.getText().trim());
                    double x2 = Double.parseDouble(jta2.getText().trim());
                    JOptionPane.showMessageDialog(null, "Result = " + (x1 * x2), "Alert", JOptionPane.INFORMATION_MESSAGE);
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Error in Numbers!", "Alert", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        pnl[4].add(divButton);
        divButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                try {
                    double x1 = Double.parseDouble(jta1.getText().trim());
                    double x2 = Double.parseDouble(jta2.getText().trim());
                    if (x2 == 0) {
                        JOptionPane.showMessageDialog(null, "Cannot divide by zero!", "Alert", JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                    JOptionPane.showMessageDialog(null, "Result = " + (x1 / x2), "Alert", JOptionPane.INFORMATION_MESSAGE);
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Error in Numbers!", "Alert", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        setSize(500, 500);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Calc());
    }
}
