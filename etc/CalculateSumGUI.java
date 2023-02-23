import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CalculateSumGUI implements ActionListener {

    JFrame frame;
    JLabel labelOne, labelTwo, labelThree;
    JTextField tNumberOne, tNUmberTwo, tResult;
    JButton bSum;

    public CalculateSumGUI() {

        frame = new JFrame("Calculate Sum");
        labelOne = new JLabel("Enter number one:");
        labelTwo = new JLabel("Enter number two:");
        labelThree = new JLabel("Result:");
        tNumberOne = new JTextField();
        tNUmberTwo = new JTextField();
        tResult = new JTextField();
        bSum = new JButton("SUM");

        frame.add(labelOne);
        frame.add(tNumberOne);
        frame.add(labelTwo);
        frame.add(tNUmberTwo);
        frame.add(labelThree);
        frame.add(tResult);
        frame.add(bSum);

        labelOne.setBounds(10, 10, 200, 30);
        tNumberOne.setBounds(10, 40, 100, 30);
        labelTwo.setBounds(10, 80, 200, 30);
        tNUmberTwo.setBounds(10, 110, 100, 30);
        labelThree.setBounds(10, 160, 100, 30);
        tResult.setBounds(10, 190, 100, 30);
        bSum.setBounds(10, 250, 100, 50);

        frame.setLayout(null);
        frame.setSize(500, 500);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    public static void main(String[] args) {
        new CalculateSumGUI();
    }
}
