package Lesson8Homework;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BottomFrame {
    private final JPanel panel;

    public BottomFrame(JTextField inputField) {
        panel = new JPanel();
        panel.setLayout(new GridLayout(7, 3));

        DigitButtonListener buttonListener = new DigitButtonListener(inputField);
        for (int i = 0; i <= 9; i++) {
            JButton btn = new JButton(String.valueOf(i));
            btn.addActionListener(buttonListener);
            panel.add(btn);
        }

        EqualsListener equalsListener = new EqualsListener(inputField);
        JButton equals = new JButton("=");
        equals.addActionListener(equalsListener);
        panel.add(equals);

        JButton clear = new JButton("C");
        clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inputField.setText("");
            }
        });
        panel.add(clear);

        JButton plus = new JButton("+");
        plus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fillField(inputField, e);
            }
        });
        panel.add(plus);

        JButton minus = new JButton("-");
        minus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fillField(inputField, e);
            }
        });
        panel.add(minus);

        JButton sqrt = new JButton("SQRT");
        sqrt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double a = Double.parseDouble(inputField.getText());
                a = Math.sqrt(a);
                inputField.setText(String.valueOf(a));
            }
        });
        panel.add(sqrt);

        JButton point = new JButton(".");
        point.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inputField.setText(inputField.getText() + e.getActionCommand());
            }
        });
        panel.add(point);

        JButton multiplication = new JButton("*");
        multiplication.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fillField(inputField, e);
            }
        });
        panel.add(multiplication);

        JButton division = new JButton("/");
        division.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fillField(inputField, e);
            }
        });
        panel.add(division);

        JButton openParenthesis = new JButton("(");
        openParenthesis.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fillField(inputField, e);
            }
        });
        panel.add(openParenthesis);

        JButton closeParenthesis = new JButton(")");
        closeParenthesis.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fillField(inputField, e);
            }
        });
        panel.add(closeParenthesis);
    }

    public void fillField(JTextField inputField, ActionEvent e) {
        inputField.setText(inputField.getText() + " " + e.getActionCommand() + " ");
    }

    public JPanel getPanel() {
        return panel;
    }
}
