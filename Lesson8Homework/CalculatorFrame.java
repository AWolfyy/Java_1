package Lesson8Homework;

import javax.swing.JFrame;
import javax.swing.WindowConstants;
import java.awt.BorderLayout;

public class CalculatorFrame extends JFrame {
    public CalculatorFrame() {
        setTitle("Calculator v1.0");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(800, 350, 300, 500);

        setLayout(new BorderLayout());

        TopFrame topFrame = new TopFrame();
        add(topFrame.getPanel(), BorderLayout.NORTH);

        BottomFrame bottomFrame = new BottomFrame(topFrame.getInputField());
        add(bottomFrame.getPanel(), BorderLayout.CENTER);

        setVisible(true);
    }
}
