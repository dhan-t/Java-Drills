import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class cookieClicker implements ActionListener {
    private int clicks = 0;
    private JLabel label = new JLabel("Number of clicks:  0     ");
    private JFrame frame = new JFrame();

    public cookieClicker() {

        // the clickable button
        JButton button = new JButton("Click Here");
        button.addActionListener(this);

        // the panel with the button and text
        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(200, 700, 200, 700));
        panel.setLayout(new GridLayout(2, 5));
        panel.add(button);
        panel.add(label);

        // set up the frame and display it
        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Cookie Clicker");
        frame.pack();
        frame.setVisible(true);
    }

    // process the button clicks
    public void actionPerformed(ActionEvent e) {
        clicks++;
        label.setText("Number of clicks:  " + (clicks++));

    }

    public static void main(String[] args) {
        new cookieClicker();
    }
}

// Taken from: https://introcs.cs.princeton.edu/java/15inout/GUI.java.html 
