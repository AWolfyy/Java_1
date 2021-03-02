package Lesson8Homework;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTextField;

public class TopFrame {
    private final JPanel panel;
    private final JTextField inputField;

    public TopFrame() {
        panel = new JPanel();
        panel.setLayout(new BorderLayout());
        inputField = new JTextField();
        inputField.setEditable(false);
        panel.add(inputField, BorderLayout.CENTER);
    }

    public JPanel getPanel() {
        return panel;
    }

    public JTextField getInputField() {
        return inputField;
    }
}
