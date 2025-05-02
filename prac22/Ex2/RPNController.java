package prac22.Ex2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

public class RPNController {
    private RPNModel model;
    private RPNView view;

    public RPNController(RPNModel model, RPNView view) {
        this.model = model;
        this.view = view;

        // Обработчики для кнопок
        String[] labels = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "+", "-", "*", "/", "."};
        for (String label : labels) {
            JButton button = view.getButton(label);
            if (button != null) {
                button.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String currentText = view.getInputField().getText();
                        view.getInputField().setText(currentText + label + " ");
                    }
                });
            }
        }

        // Обработчик для кнопки "="
        JButton equalsButton = view.getButton("=");
        if (equalsButton != null) {
            equalsButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    try {
                        String expression = view.getInputField().getText().trim();
                        double result = model.evaluate(expression);
                        view.getInputField().setText(String.valueOf(result));
                    } catch (Exception ex) {
                        view.showError(ex.getMessage());
                    }
                }
            });
        }
    }
}
