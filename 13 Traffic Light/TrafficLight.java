import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TrafficLight extends JPanel implements ActionListener {

    // JPanel panel;
    JRadioButton red, yellow, green;
    Color c_red, c_yellow, c_green;

    TrafficLight() {
        // panel = new JPanel();
        // panel.setBounds(0, 0, 200, 200);
        setBounds(0, 0, 200, 200);

        red = new JRadioButton("Red");
        red.setBounds(0, 0, 100, 50);
        red.addActionListener(this);

        yellow = new JRadioButton("Yellow");
        yellow.setBounds(0, 50, 100, 50);
        yellow.addActionListener(this);

        green = new JRadioButton("Green");
        green.setBounds(0, 100, 100, 50);
        green.addActionListener(this);

        red.setSelected(true);
        c_red = Color.red;
        c_yellow = Color.black;
        c_green = Color.green;

        ButtonGroup group = new ButtonGroup();
        group.add(red);
        group.add(yellow);
        group.add(green);

        // panel.add(red);
        // panel.add(yellow);
        // panel.add(green);

        add(green);
        add(yellow);
        add(red);

    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == red) {
            c_red = Color.red;
            c_yellow = Color.black;
            c_green = Color.black;
        }
        if (e.getSource() == yellow) {
            c_red = Color.black;
            c_yellow = Color.yellow;
            c_green = Color.black;
        }
        if (e.getSource() == green) {
            c_red = Color.black;
            c_yellow = Color.black;
            c_green = Color.green;
        }
        repaint();
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.drawOval(50, 50, 50, 50);
        g.drawOval(50, 100, 50, 50);
        g.drawOval(50, 150, 50, 50);

        g.setColor(c_red);
        g.fillOval(100, 50, 100, 100);

        g.setColor(c_yellow);
        g.fillOval(100, 100, 100, 100);

        g.setColor(c_green);
        g.fillOval(100, 150, 100, 100);

    }

    public static void main(String[] args) {
        new TrafficLight();
    }
}