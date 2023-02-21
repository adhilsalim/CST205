import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TrafficLight implements ActionListener {

    JPanel panel;
    JRadioButton red, yellow, green;
    Color c_red, c_yellow, c_green;

    TrafficLight() {
        panel = new JPanel();
        panel.setBounds(0, 0, 200, 200);

        red = new JRadioButton("Red");
        red.setBounds(0, 0, 100, 50);
        red.addActionListener(this);

        yellow = new JRadioButton("Yellow");
        yellow.setBounds(0, 50, 100, 50);
        yellow.addActionListener(this);

        green = new JRadioButton("Green");
        green.setBounds(0, 100, 100, 50);
        green.addActionListener(this);

        panel.add(red);
        panel.add(yellow);
        panel.add(green);

    }

    public void actionPerformed(ActionEvent e) {

    }

    public static void main(String[] args) {
        new TrafficLight();
    }
}