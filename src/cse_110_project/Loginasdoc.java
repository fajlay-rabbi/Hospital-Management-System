package cse_110_project;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.Scanner;
import javax.swing.*;

public class Loginasdoc extends JFrame {
    Loginasdoc(){
        JLabel label;
        setTitle("Hospital Managment System");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setSize(1100, 630);
        setResizable(false);
        setLocation(130, 50);
        
        //Backgourd pic
        ImageIcon img = new ImageIcon("D:\\Cse_110_Project\\src\\cse_110_project\\LoginasDoctor.png");
        label = new JLabel("",img,JLabel.CENTER);
        label.setBounds(0, 0, 1100, 630);
        
        //text field
        JTextField email = new JTextField();
        email.setBounds(610, 185, 250, 45);
        email.setFont(new Font("Consolas", Font.PLAIN, 25));
        
        JLabel Lemail=new JLabel("Username:");
        Lemail.setBounds(610, 155, 80, 30);
        Lemail.setFont(new Font("Consolas", Font.PLAIN, 15));
        
        JPasswordField pass = new JPasswordField();
        pass.setBounds(610, 295, 250, 45);
        pass.setFont(new Font("Consolas", Font.PLAIN, 25));
        
        JLabel Lpass =new JLabel("Password:");
        Lpass.setBounds(610, 265, 80, 30);
        Lpass.setFont(new Font("Consolas", Font.PLAIN, 15));
        
        //button
        ImageIcon icon = new ImageIcon("D:\\Cse_110_Project\\src\\cse_110_project\\Login.png");
        JButton button1 = new JButton(icon);
        button1.setBounds(610, 370, 112, 40);
        button1.setFocusable(false);
        
        
        
        
        button1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {               
                            try {
                        File file=new File("D:\\Cse_110_Project\\src\\cse_110_project\\docp.txt");
                        Scanner input=new Scanner(file);
                        String adminUserName = input.nextLine();
                        String adminPassword = input.nextLine();

                        if(adminUserName.equals(email.getText()) && adminPassword.equals(new String(pass.getPassword()))){

                              new docDash().setVisible(true);
                              setVisible(false);
                        }
        
                    } catch (Exception ex) {
                        System.out.println(ex); 
                }         
                        }
        });
        
        
        
        
        
        
        
        
        
        
        

        
        add(button1);
        add(Lpass);
        add(Lemail);
        add(pass);
        add(email);
        add(label);
        setVisible(true);
    }
}
