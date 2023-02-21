//package etc;

import javax.swing.*;
import java.awt.event.*;

public class ConvertTemperature implements ActionListener {

    JFrame frame;
    JTextField textBoxOne, textBoxTwo;
    JButton btnF, btnC;

    // Variables
    static String celcius;
    static String fahrenheit;

    ConvertTemperature() {

        // Creating components
        frame = new JFrame("Convert Temperature");
        textBoxOne = new JTextField("enter temperature in Celsius");
        textBoxTwo = new JTextField("enter temperature in Fahrenheit");
        btnF = new JButton("to F");
        btnC = new JButton("to C");

        // Setting bounds
        textBoxOne.setBounds(50, 50, 200, 35);
        textBoxTwo.setBounds(50, 100, 200, 35);
        btnF.setBounds(60, 150, 80, 50);
        btnC.setBounds(150, 150, 80, 50);

        // Adding components to frame
        frame.add(textBoxOne);
        frame.add(textBoxTwo);
        frame.add(btnF);
        frame.add(btnC);

        // Setting frame properties
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Adding action listeners
        textBoxOne.addActionListener(this);
        textBoxTwo.addActionListener(this);
        btnC.addActionListener(this);
        btnF.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == btnC) {
            if (textBoxOne.getText() == "") {
                textBoxOne.setText("Please enter a value");
            } else if (isNumberic(textBoxOne.getText())) {
                celcius = textBoxOne.getText();
                fahrenheit = String.valueOf((Double.parseDouble(celcius) * 9 / 5) + 32);
                textBoxTwo.setText(fahrenheit);
            } else {
                textBoxOne.setText("Please enter a value");
            }
        }

        if (e.getSource() == btnF) {
            if (textBoxTwo.getText() == "") {
                textBoxTwo.setText("Please enter a value");

            } else if (isNumberic(textBoxTwo.getText())) {
                fahrenheit = textBoxOne.getText();
                celcius = String.valueOf((Double.parseDouble(fahrenheit) - 32) * 5 / 9);
                textBoxOne.setText(celcius);
            } else {
                textBoxTwo.setText("Please enter a value");
            }
        }
    }

    public static Boolean isNumberic(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static void main(String[] args) {
        new ConvertTemperature();
    }
}