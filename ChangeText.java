import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ChangeText implements ActionListener {

    JFrame frame;
    JLabel label;
    JTextField textBox;
    JRadioButton upperCase, lowerCase;
    JButton button;

    public ChangeText() {

        frame = new JFrame("Change Text");
        label = new JLabel("Enter your text in the text box");
        textBox = new JTextField();
        upperCase = new JRadioButton("uppercase");
        lowerCase = new JRadioButton("lowercase");
        button = new JButton("GO!");

        frame.setSize(500, 600);
        frame.setVisible(true);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        label.setBounds(10, 10, 400, 200);
        textBox.setBounds(10, 410, 200, 30);
        upperCase.setBounds(10, 450, 120, 30);
        lowerCase.setBounds(140, 450, 120, 30);
        button.setBounds(10, 490, 60, 45);

        frame.add(label);
        frame.add(textBox);
        frame.add(upperCase);
        frame.add(lowerCase);
        frame.add(button);

        ButtonGroup group = new ButtonGroup();
        upperCase.setSelected(true);
        group.add(upperCase);
        group.add(lowerCase);

        button.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            try {
                String text = textBox.getText();

                if (upperCase.isSelected() == true) {
                    label.setText(text.toUpperCase());
                } else {
                    label.setText(text.toLowerCase());
                }
            } catch (Exception err) {

            }
        }

    }

    public static void main(String[] args) {
        new ChangeText();
    }
}
