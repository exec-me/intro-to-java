package prac16;
import javax.swing.*;
import java.awt.*;

public class TextEditor extends JFrame {
    private JTextArea textArea;
    private JMenuBar menuBar;
    private JMenu colorMenu;
    private JMenu fontMenu;

    public TextEditor() {
        setTitle("Text Editor");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);

        textArea = new JTextArea("Enter text...");
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        add(new JScrollPane(textArea), BorderLayout.CENTER);

        menuBar = new JMenuBar();
        colorMenu = new JMenu("Color");
        fontMenu = new JMenu("Font");

        JMenuItem blueItem = new JMenuItem("Blue");
        blueItem.addActionListener(e -> textArea.setForeground(Color.BLUE));
        JMenuItem redItem = new JMenuItem("Red");
        redItem.addActionListener(e -> textArea.setForeground(Color.RED));
        JMenuItem blackItem = new JMenuItem("Black");
        blackItem.addActionListener(e -> textArea.setForeground(Color.BLACK));
        colorMenu.add(blueItem);
        colorMenu.add(redItem);
        colorMenu.add(blackItem);

        JMenuItem timesItem = new JMenuItem("Times New Roman");
        timesItem.addActionListener(e -> textArea.setFont(new Font("Times New Roman", Font.PLAIN, 14)));
        JMenuItem sansItem = new JMenuItem("MS Sans Serif");
        sansItem.addActionListener(e -> {
            Font font = new Font("MS Sans Serif", Font.PLAIN, 14);
            if (!font.getFamily().equals("MS Sans Serif")) {
                font = new Font("SansSerif", Font.PLAIN, 14);
            }
            textArea.setFont(font);
        });
        JMenuItem courierItem = new JMenuItem("Courier New");
        courierItem.addActionListener(e -> textArea.setFont(new Font("Courier New", Font.PLAIN, 14)));
        fontMenu.add(timesItem);
        fontMenu.add(sansItem);
        fontMenu.add(courierItem);

        JMenu fileMenu = new JMenu("File");
        JMenuItem exitItem = new JMenuItem("Exit");
        exitItem.addActionListener(e -> System.exit(0));
        fileMenu.add(exitItem);

        menuBar.add(fileMenu);
        menuBar.add(colorMenu);
        menuBar.add(fontMenu);
        setJMenuBar(menuBar);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            TextEditor editor = new TextEditor();
            editor.setVisible(true);
        });
    }
}