package Lesson8Homework;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DigitButtonListener implements ActionListener {
    private final JTextField inputField;
    private final StringBuilder stringBuilder;

    public DigitButtonListener(JTextField inputField) {
        this.inputField = inputField;
        stringBuilder = new StringBuilder();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        stringBuilder.append(inputField.getText());
        stringBuilder.append(((JButton) e.getSource()).getText());
        inputField.setText(stringBuilder.toString());
        stringBuilder.setLength(0);
    }

    public StringBuilder getStringBuilder() {
        return stringBuilder;
    }
}
