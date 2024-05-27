package cse_110_project;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class LoginAsPage extends JFrame {

    LoginAsPage() {
        JLabel label;
        setTitle("Hospital Managment System");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setSize(1100, 630);
        setResizable(false);
        setLocation(130, 50);
        
        //Backgourd pic
        ImageIcon img = new ImageIcon("D:\\Cse_110_Project\\src\\cse_110_project\\Loginas.png");
        label = new JLabel("",img,JLabel.CENTER);
        label.setBounds(0, 0, 1100, 630);
        
        //button
        ImageIcon adicon = new ImageIcon("D:\\Cse_110_Project\\src\\cse_110_project\\Admin.png");
        JButton adminButton = new JButton(adicon);
        adminButton.setBounds(280, 455, 112, 40);
        adminButton.setFocusable(false);
        
        ImageIcon docicon = new ImageIcon("D:\\Cse_110_Project\\src\\cse_110_project\\Doc.png");
        JButton docButton = new JButton(docicon);
        docButton.setBounds(680, 455, 112, 40);
        docButton.setFocusable(false);
        
        
            adminButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {      
                new Loginasad().setVisible(true);
                
            }
        });
            
            
            
             docButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {      
                new Loginasdoc().setVisible(true);
                setVisible(false);
            }
        });
        
        
        
        
//        ImageIcon reicon = new ImageIcon("D:\\Cse_110_Project\\src\\cse_110_project\\Re.png");
//        JButton receButton = new JButton(reicon);
//        receButton.setBounds(808, 455, 112, 40);
//        receButton.setFocusable(false);
//        add(receButton);
        add(docButton);
        add(adminButton);
        add(label);
        setVisible(true);
    }
}
