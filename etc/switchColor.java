import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class switchColor extends JPanel implements ActionListener {

    JRadioButton red, yellow, green;
    Color colorOne, colorTwo, colorThree;

    public switchColor() {
        setBounds(0, 0, 500, 500);

        red = new JRadioButton("Red");
        red.setBounds(0, 0, 100, 50);
        red.addActionListener(this);

        yellow = new JRadioButton("Yellow");
        yellow.setBounds(0, 50, 100, 50);
        yellow.addActionListener(this);

        green = new JRadioButton("Green");
        green.setBounds(0, 100, 100, 50);
        green.addActionListener(this);

        add(red);
        add(yellow);
        add(green);
    }

    public void actionPerformed(ActionEvent e) {
        if (red.isSelected() == true) {
            colorOne = Color.red;
        }
        if (red.isSelected() == false) {
            colorOne = Color.black;
        }
        if (yellow.isSelected() == true) {
            colorTwo = Color.yellow;
        }
        if (yellow.isSelected() == false) {
            colorTwo = Color.black;
        }
        if (green.isSelected() == true) {
            colorThree = Color.green;
        }
        if (green.isSelected() == false) {
            colorThree = Color.black;
        }
        repaint();
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(colorOne);
        g.fillRect(100, 100, 100, 100);

        g.setColor(colorTwo);
        g.fillRect(200, 100, 100, 100);

        g.setColor(colorThree);
        g.fillRect(300, 100, 100, 100);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        switchColor sc = new switchColor();
        frame.add(sc);
    }

}