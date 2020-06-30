/* Simple GUI for that allow to click two buttons and increment and decrement a counter. */

package com.gatisadder;

import com.gatisadder.*;

import java.awt.BorderLayout;
import java.awt.Window;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.*;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/*
Separated UI from the logic of count,
if a button is clicked controller decides what
occurs, label on view can still contain 
count value but if I decide to change view design 
it won't affect model
*/

public class view {

    private JLabel label;
    private JFrame frame;
    private JButton buttonUp, buttonDown, buttonReset;


    public view() {

        // frame is essentially the window.
        frame = new JFrame();
        // Add the buttons
        buttonUp = new JButton(constants.kUp);
        buttonDown = new JButton(constants.kDown);
        buttonReset = new JButton(constants.kReset);
        
        // Create label
        label = new JLabel();
        // Create pannel
        JPanel panel = new JPanel();
        
        // Setup border
        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 30, 30));
        // Setup layout
        panel.setLayout(new GridLayout(4, 1));
        // Add lable
        panel.add(label);
        // Add buttons to pannel
        panel.add(buttonUp);
        panel.add(buttonDown);
        panel.add(buttonReset);
        
        // Add elements
        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("The Amazing Clicker");
        frame.setMinimumSize(new Dimension(300,200));
        frame.pack(); // set the window to match a certain size
        frame.setVisible(true);

    }

    public void setLabel(int text) {
        label.setText("Count: " + text);
    }

    public void addController(ActionListener listenerButtons) {
        buttonUp.addActionListener(listenerButtons);
        buttonUp.setActionCommand(constants.kUp);

        buttonDown.addActionListener(listenerButtons);
        buttonDown.setActionCommand(constants.kDown);

        buttonReset.addActionListener(listenerButtons);
        buttonReset.setActionCommand(constants.kReset);    
    }

    public void close() {
        frame.dispose();
    }

    public static class CloseListener extends WindowAdapter {
        public void windowClosing(WindowEvent e) {
            e.getWindow().setVisible(false);
            System.exit(0);
        }
    }
}
