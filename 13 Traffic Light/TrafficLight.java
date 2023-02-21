import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TrafficLight extends JPanel implements ActionListener {

    JRadioButton red, yellow, green;
    Color c_red, c_yellow, c_green;

    TrafficLight() {

        setBounds(0, 0, 400, 400);

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
        c_green = Color.black;

        ButtonGroup group = new ButtonGroup();
        group.add(red);
        group.add(yellow);
        group.add(green);

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

        g.drawRect(40, 30, 70, 190);
        g.setColor(Color.black);
        g.fillRect(40, 30, 70, 190);

        g.drawOval(50, 50, 50, 50);
        g.setColor(c_red);
        g.fillOval(50, 50, 50, 50);

        g.drawOval(50, 100, 50, 50);
        g.setColor(c_yellow);
        g.fillOval(50, 100, 50, 50);

        g.drawOval(50, 150, 50, 50);
        g.setColor(c_green);
        g.fillOval(50, 150, 50, 50);

    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Traffic Light");
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        TrafficLight trafficLight = new TrafficLight();
        frame.add(trafficLight);
    }
}