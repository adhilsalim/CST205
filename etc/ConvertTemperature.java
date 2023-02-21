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

        if (e.getSource() == textBoxOne && textBoxOne.getText() == "enter temperature in Celsius") {
            textBoxTwo.setText("");
        }
        if (e.getSource() == textBoxTwo) {

        }

        if (e.getSource() == btnC) {
            if (textBoxOne.getText() == "") {
                textBoxTwo.setText("Please enter a value");
            } else {
                celcius = textBoxOne.getText();
                fahrenheit = String.valueOf((Double.parseDouble(celcius) * 9 / 5) + 32);
                textBoxTwo.setText(fahrenheit);
            }
        }
    }

    public static void main(String[] args) {
        new ConvertTemperature();
    }
}