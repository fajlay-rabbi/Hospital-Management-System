package cse_110_project;

import java.awt.Font;
import javax.swing.*;

public class LoginasRes extends JFrame {
    LoginasRes(){
        JLabel label;
        setTitle("Hospital Managment System");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setSize(1100, 630);
        setResizable(false);
        setLocation(130, 50);
        
        //Backgourd pic
        ImageIcon img = new ImageIcon("D:\\Cse_110_Project\\src\\cse_110_project\\Loginasres.png");
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

        
        add(button1);
        add(Lpass);
        add(Lemail);
        add(pass);
        add(email);
        add(label);
        setVisible(true);
    }
}



//        p1.setBackground(Color.white);
//        
//                String[][] rec = {
//            {"1", "Steve", "AUS"},
//            {"2", "Virat", "IND"},
//            {"3", "Kane", "NZ"},
//            {"4", "David", "AUS"},
//            {"5", "Ben", "ENG"},
//            {"6", "Eion", "ENG"},};
//        String[] header = {"Rank", "Player", "Country"};
//        JTable table = new JTable(rec, header);
//        p1.add(new JScrollPane(table));