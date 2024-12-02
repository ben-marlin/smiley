package edu.guilford;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SmileyFrame extends JFrame {

    ImageIcon smileyIcon, goofyIcon;
    JLabel label;

    public SmileyFrame() {
        // Set the title of the frame
        setTitle("Smiley Frame");

        // Set the size of the frame
        setSize(360,360);

        // Set the default close operation
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a panel
        // Modify this code to match your private class
        JPanel panel = new JPanel();

        // Load the icon
        smileyIcon = new ImageIcon(getClass().getResource("/smiley.png"));
        goofyIcon = new ImageIcon(getClass().getResource("/goofy.png"));

        // Create a label with the icon
        label = new JLabel(smileyIcon);

        // Add the label to the panel
        panel.add(label);

        // Add the panel to the frame
        add(panel);

        // Set the frame visible
        setVisible(true);
    }

    // create your private class here
    // implement a mouse listener and override 
    // the method for mouse click events only

    public static void main(String[] args) {
        // Instantiate the SmileyFrame object
        new SmileyFrame();
    }
}
