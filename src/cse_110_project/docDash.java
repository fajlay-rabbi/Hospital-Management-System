package cse_110_project;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class docDash extends JFrame {
    docDash(){
        
        setTitle("Hospital Managment System");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setSize(1100, 630);
        setResizable(false);
        setLocation(130, 50);
        
        //Backgourd pic
        ImageIcon img = new ImageIcon("D:\\Cse_110_Project\\src\\cse_110_project\\docdash.png");
        JLabel label = new JLabel("",img,JLabel.CENTER);
        label.setBounds(0, 0, 1100, 630);
        
        ImageIcon lupbtn = new ImageIcon("D:\\Cse_110_Project\\src\\cse_110_project\\Prescription.png");
        JButton docD = new JButton(lupbtn);
        docD.setBounds(420, 243, 220, 160);
        docD.setFocusable(false);
        
        
        ImageIcon icon = new ImageIcon("D:\\Cse_110_Project\\src\\cse_110_project\\Logout.png");
        JButton logout = new JButton(icon);
        logout.setBounds(978, 87, 112, 40);
        logout.setFocusable(false);
        
        
        
        
        
        
        logout.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
             
                new LoginAsPage().setVisible(true);
                setVisible(false);
            }
        });
        
        
            docD.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
             
                new DocP().setVisible(true);
                setVisible(false);
            }
        });
        
        
        
        
        
        add(label);
        add(logout);
        add(docD);
        setVisible(true);
    }
    
}
