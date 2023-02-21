import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TrafficLight extends JPanel implements ActionListener {

    // creating radio buttons
    JRadioButton red, yellow, green;

    // creating colors for lights
    Color stopLightColor, waitLightColor, goLightColor;

    TrafficLight() {

        // setting bounds for the panel (the area to draw on)
        setBounds(0, 0, 400, 400);

        // creating radio buttons, naming them, setting bounds and adding action
        // listener
        red = new JRadioButton("Red");
        red.setBounds(0, 0, 100, 50);
        red.addActionListener(this);

        yellow = new JRadioButton("Yellow");
        yellow.setBounds(0, 50, 100, 50);
        yellow.addActionListener(this);

        green = new JRadioButton("Green");
        green.setBounds(0, 100, 100, 50);
        green.addActionListener(this);

        // DEFAULT
        red.setSelected(true); // setting red radio button as selected by default
        stopLightColor = Color.red; // setting red light as red by default
        waitLightColor = Color.black; // setting yellow light as black by default
        goLightColor = Color.black; // setting green light as black by default

        // creating a group of radio buttons
        ButtonGroup group = new ButtonGroup();
        group.add(red);
        group.add(yellow);
        group.add(green);

        // adding radio buttons to the panel
        add(red);
        add(yellow);
        add(green);
    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == red) {
            stopLightColor = Color.red;
            waitLightColor = Color.black;
            goLightColor = Color.black;
        } else if (e.getSource() == yellow) {
            stopLightColor = Color.black;
            waitLightColor = Color.yellow;
            goLightColor = Color.black;
        } else if (e.getSource() == green) {
            stopLightColor = Color.black;
            waitLightColor = Color.black;
            goLightColor = Color.green;
        }

        repaint();
    }

    public void paintComponent(Graphics g) {

        super.paintComponent(g);

        // creating yellow box
        g.setColor(Color.yellow);
        g.drawRect(35, 20, 80, 205);
        g.fillRect(35, 20, 80, 205);

        // creating black box
        g.setColor(Color.black);
        g.drawRect(40, 30, 70, 190);
        g.fillRect(40, 30, 70, 190);

        // creating red light
        g.setColor(Color.black); // for the outline
        g.drawOval(50, 50, 50, 50);
        g.setColor(stopLightColor);
        g.fillOval(50, 50, 50, 50);

        // creating yellow light
        g.setColor(Color.black); // for the outline
        g.drawOval(50, 100, 50, 50);
        g.setColor(waitLightColor);
        g.fillOval(50, 100, 50, 50);

        // creating green light
        g.setColor(Color.black); // for the outline
        g.drawOval(50, 150, 50, 50);
        g.setColor(goLightColor);
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