package prac16;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;


class GuessinGame extends JFrame implements ActionListener {
    static JFrame frame;
    static JTextField result;
    static JLabel info;

    static Random rand = new Random();
    static int randomNumber, attempts = 3;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            frame = new JFrame("Guess");

            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setResizable(false);

            JPanel pad = new JPanel(new GridBagLayout());

            JPanel fieldPanel = new JPanel(new GridBagLayout());

            GridBagConstraints gbc = new GridBagConstraints();

            randomNumber = rand.nextInt(1, 20);

            info = new JLabel("Guess number");
            gbc.insets = new Insets(25, 10, 0, 10);
            gbc.gridy = 0;
            fieldPanel.add(info, gbc);

            result = new JTextField(25);
            gbc.insets = new Insets(25, 10, 0, 10);
            gbc.gridy = 1;
            fieldPanel.add(result, gbc);

            JButton[] buttons = {new JButton("New game"), new JButton("Guess")};

            GuessinGame g = new GuessinGame();

            for (int i = 0; i < 2; i++) {
                gbc.gridx = i;
                gbc.insets = new Insets(5, 10, 5, 10);
                pad.add(buttons[i], gbc);
                buttons[i].addActionListener(g);
            }

            frame.add(fieldPanel, BorderLayout.NORTH);
            frame.add(pad, BorderLayout.CENTER);

            frame.setSize(500, 200);
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        switch (command) {
            case "Guess":
                int guess;
                try {
                    guess = Integer.parseInt(result.getText());
                } catch (NumberFormatException ex) {
                    info.setText("This is not a number.");
                    break;
                }
                if (randomNumber == guess) {
                    resetGame();
                    info.setText("You won!");
                    result.setText("");
                } else if (attempts == 0) {
                    resetGame();
                    info.setText("You loose. Game restarted.");
                    result.setText("");
                } else {
                    attempts--;
                    String moreOr = ((guess < randomNumber) ? "bigger" : "lesser");
                    info.setText("Wrong number is " + moreOr + ". You have " + (attempts + 1) + " tries.");
                    result.setText("");
                }
                break;
            case "New game":
                resetGame();
                info.setText("Guess new number.");
                result.setText("");
                break;
        }
    }

    static void resetGame() {
        attempts = 3;
        randomNumber = rand.nextInt(1, 20);
    }
}