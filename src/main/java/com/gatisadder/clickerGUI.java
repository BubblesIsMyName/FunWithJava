/* Simple GUI for that allow to click two buttons and increment and decrement a counter. */

package com.gatisadder;


import java.awt.BorderLayout;
import java.awt.Window;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class clickerGUI implements ActionListener {

    private int count = 0;
    private JLabel lable;
    private JFrame frame;
    private JPanel panel;
    private JButton buttonUp, buttonDown;
    // private Dimension frameMinimumSize;

    public clickerGUI() {

        // frame is essentially the window.
        frame = new JFrame();
        // Add the buttons
        buttonUp = new JButton("+");
        buttonUp.addActionListener((ActionListener) this);
        buttonDown = new JButton("-");
        buttonDown.addActionListener(this);
        
        // Create label
        lable = new JLabel("count = 0");
        // Create pannel
        panel = new JPanel();
        
        // Setup border
        System.out.println("Pannel size is" + panel.getSize());
        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 30, 30));
        // Setup layout
        panel.setLayout(new GridLayout(3, 1));
        // Add lable
        panel.add(lable);
        // Add buttons to pannel
        panel.add(buttonUp);
        panel.add(buttonDown);
        
        // Add elements
        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("The Amazing Clicker");
        frame.setMinimumSize(new Dimension(300,200));
        frame.pack(); // set the window to match a certain size
        frame.setVisible(true);

    }

    public static void main(String[] args) {
        new clickerGUI();
    }

    
    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource() == buttonUp){
        count++;
        if(count > 100) count = 0;
        lable.setText("count = " + count);
    } else if (e.getSource() == buttonDown) {
        count--;
        if(count < 0) count = 100;
        lable.setText("count = " + count);
       }
    }
}
