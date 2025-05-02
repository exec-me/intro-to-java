package prac6.task5;

import javax.swing.*;
import java.awt.*;

public class ShopGUI extends JFrame {
    private Shop shop;
    private JTextArea output;

    public ShopGUI() {
        shop = new Shop();
        setTitle("Computer Shop");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLayout(new BorderLayout());

        output = new JTextArea();
        output.setEditable(false);
        add(new JScrollPane(output), BorderLayout.CENTER);

        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new GridLayout(5, 2));

        JLabel brandLabel = new JLabel("Brand:");
        JComboBox<Brand> brandCombo = new JComboBox<>(Brand.values());
        JLabel procModelLabel = new JLabel("Processor Model:");
        JTextField procModelField = new JTextField();
        JLabel procSpeedLabel = new JLabel("Processor Speed (GHz):");
        JTextField procSpeedField = new JTextField();
        JLabel memoryLabel = new JLabel("Memory (GB):");
        JTextField memoryField = new JTextField();
        JLabel monitorLabel = new JLabel("Monitor Size (inches):");
        JTextField monitorField = new JTextField();

        inputPanel.add(brandLabel);
        inputPanel.add(brandCombo);
        inputPanel.add(procModelLabel);
        inputPanel.add(procModelField);
        inputPanel.add(procSpeedLabel);
        inputPanel.add(procSpeedField);
        inputPanel.add(memoryLabel);
        inputPanel.add(memoryField);
        inputPanel.add(monitorLabel);
        inputPanel.add(monitorField);

        JPanel buttonPanel = new JPanel();
        JButton addButton = new JButton("Add Computer");
        JButton searchButton = new JButton("Search by Brand");
        buttonPanel.add(addButton);
        buttonPanel.add(searchButton);

        add(inputPanel, BorderLayout.NORTH);
        add(buttonPanel, BorderLayout.SOUTH);

        addButton.addActionListener(e -> {
            try {
                Brand brand = (Brand) brandCombo.getSelectedItem();
                String procModel = procModelField.getText();
                double procSpeed = Double.parseDouble(procSpeedField.getText());
                int memory = Integer.parseInt(memoryField.getText());
                int monitorSize = Integer.parseInt(monitorField.getText());

                Computer computer = new Computer(
                        brand,
                        new Processor(procModel, procSpeed),
                        new Memory(memory),
                        new Monitor(monitorSize)
                );
                shop.addComputer(computer);
                output.append("Added: " + computer + "\n");
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Invalid input", "Error", JOptionPane.ERROR_MESSAGE);
            }
        });

        searchButton.addActionListener(e -> {
            Brand brand = (Brand) brandCombo.getSelectedItem();
            Computer found = shop.findComputer(brand);
            if (found != null) {
                output.append("Found: " + found + "\n");
            } else {
                output.append("No computer found for brand: " + brand + "\n");
            }
        });

        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new ShopGUI().setVisible(true));
    }
}
