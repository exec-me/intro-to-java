package prac15;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Country extends JFrame {
    private JComboBox<String> countryComboBox;
    private JLabel infoLabel;
    public Country() {
        setTitle("Hello Swing");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 150);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout());

        String[] countries = {"Australia", "China", "England", "Russia"};
        countryComboBox = new JComboBox<>(countries);
        countryComboBox.setSelectedItem("Australia");

        infoLabel = new JLabel("Choose country.");

        add(countryComboBox);
        add(infoLabel);

        countryComboBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    String selectedCountry = (String) countryComboBox.getSelectedItem();
                    updateCountryInfo(selectedCountry);
                }
            }
        });
    }

    private void updateCountryInfo(String country) {
        switch (country) {
            case "Australia":
                infoLabel.setText("Australia: Canberra.");
                break;
            case "China":
                infoLabel.setText("China: Beijing.");
                break;
            case "England":
                infoLabel.setText("England: London.");
                break;
            case "Russia":
                infoLabel.setText("Russia: Moscow.");
                break;
            default:
                infoLabel.setText("No country.");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Country frame = new Country();
            frame.setVisible(true);
        });
    }
}
