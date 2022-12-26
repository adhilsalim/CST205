import javax.swing.*;
import java.awt.event.*;

public class calculator implements ActionListener {
    JFrame calculatorFrame;
    JTextField textBox;
    JButton btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btnDot, btnAdd, btnSubtract, btnMultiply,
            btnDivide, btnEquals, btnDelete, btnClear;

    // Variables
    static int btnPaddingX = 10;
    static int btnPaddingY = 10;
    static double variableOne = 0, variableTwo = 0, result = 0;
    static String sResult = "";
    static int operationNumber = -1;

    calculator() {
        calculatorFrame = new JFrame("calculator");

        // Creating components
        textBox = new JTextField();

        btn0 = new JButton("0");
        btn1 = new JButton("1");
        btn2 = new JButton("2");
        btn3 = new JButton("3");
        btn4 = new JButton("4");
        btn5 = new JButton("5");
        btn6 = new JButton("6");
        btn7 = new JButton("7");
        btn8 = new JButton("8");
        btn9 = new JButton("9");

        btnDot = new JButton(".");
        btnAdd = new JButton("+");
        btnSubtract = new JButton("-");
        btnMultiply = new JButton("x");
        btnDivide = new JButton("/");

        btnDelete = new JButton("Delete");
        btnClear = new JButton("Clear");
        btnEquals = new JButton("=");

        // Setting bounds
        textBox.setBounds(50, 40, 230, 40);

        btn1.setBounds(50, 100, 50, 50);
        btn2.setBounds(110, 100, 50, 50);
        btn3.setBounds(170, 100, 50, 50);
        btnAdd.setBounds(230, 100, 50, 50);

        btn4.setBounds(50, 160, 50, 50);
        btn5.setBounds(110, 160, 50, 50);
        btn6.setBounds(170, 160, 50, 50);
        btnSubtract.setBounds(230, 160, 50, 50);

        btn7.setBounds(50, 220, 50, 50);
        btn8.setBounds(110, 220, 50, 50);
        btn9.setBounds(170, 220, 50, 50);
        btnMultiply.setBounds(230, 220, 50, 50);

        btnDot.setBounds(50, 280, 50, 50);
        btn0.setBounds(110, 280, 50, 50);
        btnEquals.setBounds(230, 280, 50, 50);
        btnDivide.setBounds(170, 280, 50, 50);

        btnClear.setBounds(50, 340, 110, 50);
        btnDelete.setBounds(170, 340, 110, 50);

        // Adding components
        calculatorFrame.add(textBox);

        calculatorFrame.add(btn1);
        calculatorFrame.add(btn2);
        calculatorFrame.add(btn3);
        calculatorFrame.add(btnAdd);

        calculatorFrame.add(btn4);
        calculatorFrame.add(btn5);
        calculatorFrame.add(btn6);
        calculatorFrame.add(btnSubtract);

        calculatorFrame.add(btn7);
        calculatorFrame.add(btn8);
        calculatorFrame.add(btn9);
        calculatorFrame.add(btnMultiply);

        calculatorFrame.add(btnDot);
        calculatorFrame.add(btn0);
        calculatorFrame.add(btnDivide);

        calculatorFrame.add(btnDelete);
        calculatorFrame.add(btnClear);
        calculatorFrame.add(btnEquals);

        // Setting layout
        calculatorFrame.setLayout(null);
        calculatorFrame.setVisible(true);
        calculatorFrame.setSize(350, 500);

        // Setting close operation
        calculatorFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Adding action listeners
        btn0.addActionListener(this);
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
        btn4.addActionListener(this);
        btn5.addActionListener(this);
        btn6.addActionListener(this);
        btn7.addActionListener(this);
        btn8.addActionListener(this);
        btn9.addActionListener(this);
        btnAdd.addActionListener(this);
        btnSubtract.addActionListener(this);
        btnMultiply.addActionListener(this);
        btnDivide.addActionListener(this);
        btnDot.addActionListener(this);
        btnDelete.addActionListener(this);
        btnClear.addActionListener(this);
        btnEquals.addActionListener(this);

    }

    public void actionPerformed(ActionEvent e) {

        try {
            if (e.getSource() == btn0) {
                textBox.setText(textBox.getText().concat("0"));
            } else if (e.getSource() == btn1) {
                textBox.setText(textBox.getText().concat("1"));
            } else if (e.getSource() == btn2) {
                textBox.setText(textBox.getText().concat("2"));
            } else if (e.getSource() == btn3) {
                textBox.setText(textBox.getText().concat("3"));
            } else if (e.getSource() == btn4) {
                textBox.setText(textBox.getText().concat("4"));
            } else if (e.getSource() == btn5) {
                textBox.setText(textBox.getText().concat("5"));
            } else if (e.getSource() == btn6) {
                textBox.setText(textBox.getText().concat("6"));
            } else if (e.getSource() == btn7) {
                textBox.setText(textBox.getText().concat("7"));
            } else if (e.getSource() == btn8) {
                textBox.setText(textBox.getText().concat("8"));
            } else if (e.getSource() == btn9) {
                textBox.setText(textBox.getText().concat("9"));
            } else if (e.getSource() == btnDot) {
                textBox.setText(textBox.getText().concat("."));
            } else if (e.getSource() == btnAdd) {

                clearTextBox();
                operationNumber = 1;
                variableOne = Double.parseDouble(textBox.getText());

            } else if (e.getSource() == btnSubtract) {

                clearTextBox();
                operationNumber = 2;
                variableOne = Double.parseDouble(textBox.getText());

            } else if (e.getSource() == btnMultiply) {

                clearTextBox();
                operationNumber = 3;
                variableOne = Double.parseDouble(textBox.getText());

            } else if (e.getSource() == btnDivide) {

                clearTextBox();
                operationNumber = 4;
                variableOne = Double.parseDouble(textBox.getText());

            } else if (e.getSource() == btnDelete) {

                if (textBox.getText().length() != 0) {
                    String temp = textBox.getText();
                    clearTextBox();

                    for (int i = 0; i < temp.length() - 1; i++)
                        textBox.setText(textBox.getText() + temp.charAt(i));
                }

            } else if (e.getSource() == btnClear) {

                clearTextBox();

            } else if (e.getSource() == btnEquals) {

                if (operationNumber == 1) {
                    result = Double.parseDouble(textBox.getText()) + variableOne;
                }
                if (operationNumber == 2) {
                    result = Double.parseDouble(textBox.getText()) - variableOne;
                }
                if (operationNumber == 3) {
                    result = Double.parseDouble(textBox.getText()) * variableOne;
                }
                if (operationNumber == 4) {
                    result = Double.parseDouble(textBox.getText()) / variableOne;
                }
                // sResult = (String)(result);
                // textBox.setText(result);
            }
        } catch (Exception err) {
        }
    }

    void clearTextBox() {
        textBox.setText("");
    }

    public static void main(String[] args) {
        new calculator();
    }
}
// 350-500