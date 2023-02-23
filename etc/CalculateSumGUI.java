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
        labelTwo = new JLabel("Enter number two");
        labelThree = new JLabel("Result:");
        tNumberOne = new JTextField();
        tNUmberTwo = new JTextField();
        tResult = new JTextField();
        bSum = new JButton();

        frame.add(labelOne);
        frame.add(labelTwo);
        frame.add(labelThree);
        frame.add(tNumberOne);
        frame.add(tNUmberTwo);
        frame.add(tResult);
        frame.add(bSum);

        frame.setLayout(new FlowLayout(0, 10, 10));
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
