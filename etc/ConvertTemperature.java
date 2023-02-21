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
        btnF = new JButton("Convert to Fahrenheit");
        btnC = new JButton("Convert to Celsius");

        // Setting bounds
        textBoxOne.setBounds(50, 50, 200, 50);
        textBoxTwo.setBounds(50, 80, 200, 50);
        btnF.setBounds(50, 110, 100, 20);
        btnC.setBounds(50, 140, 100, 20);

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
        btnC.addActionListener(this);
        btnF.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
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