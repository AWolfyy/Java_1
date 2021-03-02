package Lesson8Homework;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EqualsListener implements ActionListener {
    private final JTextField inputField;

    public EqualsListener(JTextField inputField) {
        this.inputField = inputField;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //doTask1();

        ScriptEngineManager sem = new ScriptEngineManager();
        ScriptEngine se = sem.getEngineByName("Nashorn");
        String expression = inputField.getText();
        Object result = null;
        try {
            result = se.eval(expression);
        } catch (ScriptException scriptException) {
            scriptException.printStackTrace();
        }
        inputField.setText(String.valueOf(result));
    }

    public void doTask1() {
        String[] arr = inputField.getText().split(" ");
        if (arr[1].equals("+")) {
            float c = (Float.parseFloat(arr[0])) + (Float.parseFloat(arr[2]));
            inputField.setText(String.valueOf(c));
        } else if (arr[1].equals("-")) {
            float c = (Float.parseFloat(arr[0])) - (Float.parseFloat(arr[2]));
            inputField.setText(String.valueOf(c));
        } else if (arr[1].equals("*")) {
            float c = (Float.parseFloat(arr[0])) * (Float.parseFloat(arr[2]));
            inputField.setText(String.valueOf(c));
        } else {
            float c = (Float.parseFloat(arr[0])) / (Float.parseFloat(arr[2]));
            inputField.setText(String.valueOf(c));
        }
    }
}
