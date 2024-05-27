
package cse_110_project;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class HomePage extends JFrame {
    HomePage(){
        
        JLabel label;
        setTitle("Hospital Managment System");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setSize(1100, 630);
        setResizable(false);
        setLocation(130,50);
        
        //Login button
        ImageIcon icon = new ImageIcon("D:\\Cse_110_Project\\src\\cse_110_project\\Login.png");
        JButton button = new JButton(icon);
        button.setBounds(600, 475, 112, 40);
        button.setFocusable(false);
        
        
        //Backgourd pic
        ImageIcon img = new ImageIcon("D:\\Cse_110_Project\\src\\cse_110_project\\Home3.png");
        label = new JLabel("",img,JLabel.CENTER);
        label.setBounds(0, 0, 1100, 630);
        
        
        
            button.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {      
                new LoginAsPage().setVisible(true);
            }
        });
        
        
        
        
        
        
        
        
        add(label);
        add(button);
        setVisible(true);
    }
    
    

    
    
    
}
