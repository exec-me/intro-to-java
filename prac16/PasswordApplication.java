package prac16;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class PasswordApplication extends JFrame {
    private JTextField serviceField;
    private JTextField userNameField;
    private JPasswordField passwordField;

    public PasswordApplication() {
        setTitle("Password application");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 180);
        setLocationRelativeTo(null);

        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.anchor = GridBagConstraints.WEST;

        JLabel serviceLabel = new JLabel("Service:");
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.fill = GridBagConstraints.NONE;
        gbc.weightx = 0;
        add(serviceLabel, gbc);

        serviceField = new JTextField(20);
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 1;
        add(serviceField, gbc);

        JLabel userNameLabel = new JLabel("User name:");
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.fill = GridBagConstraints.NONE;
        gbc.weightx = 0;
        add(userNameLabel, gbc);

        userNameField = new JTextField(20);
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 1;
        add(userNameField, gbc);

        JLabel passwordLabel = new JLabel("Password:");
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.fill = GridBagConstraints.NONE;
        gbc.weightx = 0;
        add(passwordLabel, gbc);

        passwordField = new JPasswordField(20);
        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 1;
        add(passwordField, gbc);

        JButton checkButton = new JButton("Check");
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 1;
        add(checkButton, gbc);

        JButton clearButton = new JButton("Clear");
        gbc.gridx = 1;
        gbc.gridy = 3;
        gbc.gridwidth = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 1;
        add(clearButton, gbc);

        checkButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String service = serviceField.getText().trim();
                String userName = userNameField.getText().trim();
                String password = new String(passwordField.getPassword()).trim();

                if (service.isEmpty() || userName.isEmpty() || password.isEmpty()) {
                    JOptionPane.showMessageDialog(PasswordApplication.this,
                            "all fields must be filled",
                            "ERR",
                            JOptionPane.ERROR_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(PasswordApplication.this,
                            "Saved data:\nService: " + service + "\nUser name: " + userName + "\nPassword: " + password,
                            "SUC",
                            JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });

        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                serviceField.setText("");
                userNameField.setText("");
                passwordField.setText("");
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            PasswordApplication app = new PasswordApplication();
            app.setVisible(true);
        });
    }
}