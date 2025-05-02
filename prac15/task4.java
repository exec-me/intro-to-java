package prac15;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

class Calc4 extends JFrame {
    JTextField res = new JTextField();
    JButton[] numberButtons = new JButton[10];
    JButton dotButton = new JButton(".");
    JButton addButton = new JButton("+");
    JButton subButton = new JButton("-");
    JButton multButton = new JButton("*");
    JButton divButton = new JButton("/");
    JButton resButton = new JButton("=");
    JPanel pnl = new JPanel(new GridLayout(2, 1));
    JPanel panel = new JPanel(new GridLayout(4, 4, 30, 10));

    Calc4() {
        super("Calculator");
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        res.setEditable(false);
        res.setHorizontalAlignment(JTextField.CENTER);
        res.setPreferredSize(new Dimension(400, 100));
        pnl.add(res, BorderLayout.CENTER);

        for (int i = 0; i < 10; i++) {
            int index = i;
            numberButtons[i] = new JButton(String.valueOf(i));
            panel.add(numberButtons[i]);
            numberButtons[i].addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent ae) {
                    try {
                        res.setText(res.getText() + String.valueOf(index));
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }
            });
        }

        panel.add(dotButton);
        dotButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                try {
                    res.setText(res.getText() + ".");
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        panel.add(addButton);
        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                try {
                    res.setText(res.getText() + "+");
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        panel.add(subButton);
        subButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                try {
                    res.setText(res.getText() + "-");
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        panel.add(multButton);
        multButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                try {
                    res.setText(res.getText() + "*");
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        panel.add(divButton);
        divButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                try {
                    res.setText(res.getText() + "/");
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        panel.add(resButton);
        resButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                try {
                    String input = res.getText();
                    String[] parts = input.split("(?<=[-+*/])|(?=[-+*/])");
                    List<Double> numbers = new ArrayList<>();
                    List<String> operators = new ArrayList<>();

                    for (String part : parts) {
                        if (part.matches("[0-9.]+")) {
                            double temp = Double.parseDouble(part);
                            numbers.add(temp);
                        } else {
                            operators.add(part);
                        }
                    }

                    for (int i = 0; i < operators.size(); i++) {
                        String operator = operators.get(i);
                        if (operator.equals("*") || operator.equals("/")) {
                            double a = numbers.get(i);
                            double b = numbers.get(i + 1);
                            if (operator.equals("/") && b == 0) {
                                JOptionPane.showMessageDialog(null, "Cannot divide by zero!", "Error", JOptionPane.ERROR_MESSAGE);
                                return;
                            }
                            double result = operator.equals("*") ? a * b : a / b;
                            numbers.set(i, result);
                            numbers.remove(i + 1);
                            operators.remove(i);
                            i--;
                        }
                    }

                    double finalResult = numbers.get(0);
                    for (int i = 0; i < operators.size(); i++) {
                        String operator = operators.get(i);
                        double nextNumber = numbers.get(i + 1);
                        if (operator.equals("+")) {
                            finalResult += nextNumber;
                        } else if (operator.equals("-")) {
                            finalResult -= nextNumber;
                        }
                    }

                    JOptionPane.showMessageDialog(null, "Result = " + finalResult, "Alert", JOptionPane.INFORMATION_MESSAGE);
                    res.setText(String.valueOf(finalResult));
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        pnl.add(panel, BorderLayout.CENTER);
        add(pnl);

        setSize(500, 350);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Calc4());
    }
}