package prac22.Ex2;

import javax.swing.*;
import java.awt.*;

public class RPNView {
    private JFrame frame;
    private JTextField inputField;
    private JButton[] buttons;

    public RPNView() {
        frame = new JFrame("MyCalculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        frame.setSize(300, 400);

        // Текстовое поле для ввода
        inputField = new JTextField();
        inputField.setEditable(true);
        inputField.setFont(new Font("Arial", Font.PLAIN, 20));
        frame.add(inputField, BorderLayout.NORTH);

        // Панель для кнопок
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(4, 4, 5, 5));

        // Массив кнопок
        String[] buttonLabels = {
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "0", ".", "+", "="
        };
        buttons = new JButton[buttonLabels.length];

        for (int i = 0; i < buttonLabels.length; i++) {
            buttons[i] = new JButton(buttonLabels[i]);
            buttons[i].setFont(new Font("Arial", Font.PLAIN, 20));
            buttonPanel.add(buttons[i]);
        }

        frame.add(buttonPanel, BorderLayout.CENTER);
        frame.setVisible(true);
    }

    public JTextField getInputField() {
        return inputField;
    }

    public JButton getButton(String label) {
        for (JButton button : buttons) {
            if (button.getText().equals(label)) {
                return button;
            }
        }
        return null;
    }

    public void showError(String message) {
        JOptionPane.showMessageDialog(frame, message, "Error", JOptionPane.ERROR_MESSAGE);
    }
}
