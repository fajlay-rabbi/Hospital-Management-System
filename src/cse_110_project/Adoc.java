package cse_110_project;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Formatter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.table.*;

public class Adoc extends JFrame {

    JTable table = new JTable();

    Adoc() {
        
        setTitle("Hospital Managment System");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setSize(1100, 630);
        setResizable(false);
        setLocation(130, 50);
        
        JTextField name = new JTextField();
        name.setBounds(30, 40, 200, 40);
        name.setFont(new Font("Consolas", Font.PLAIN, 20));

        JLabel Lname = new JLabel("Username:");
        Lname.setBounds(30, 10, 80, 30);
        Lname.setFont(new Font("Consolas", Font.PLAIN, 15));

        JLabel Aname = new JLabel("Password:");
        Aname.setBounds(30, 80, 80, 30);
        Aname.setFont(new Font("Consolas", Font.PLAIN, 15));

        JPasswordField pass = new JPasswordField();
        pass.setBounds(30, 108, 200, 40);
        pass.setFont(new Font("Consolas", Font.PLAIN, 20));

        JLabel Lnum = new JLabel("Phone:");
        Lnum.setBounds(30, 150, 80, 30);
        Lnum.setFont(new Font("Consolas", Font.PLAIN, 15));

        JTextField num = new JTextField();
        num.setBounds(30, 180, 200, 40);
        num.setFont(new Font("Consolas", Font.PLAIN, 20));

        JLabel Lsec = new JLabel("Specialist:");
        Lsec.setBounds(30, 220, 100, 30);
        Lsec.setFont(new Font("Consolas", Font.PLAIN, 15));

        JTextField dep = new JTextField();
        dep.setBounds(30, 250, 200, 40);
        dep.setFont(new Font("Consolas", Font.PLAIN, 20));

        JLabel Lgen = new JLabel("Gender:");
        Lgen.setBounds(30, 290, 100, 30);
        Lgen.setFont(new Font("Consolas", Font.PLAIN, 15));

        JTextField sex = new JTextField();
        sex.setFont(new Font("Consolas", Font.PLAIN, 20));
        sex.setBounds(30, 320, 200, 40);

        JLabel LAge = new JLabel("Age:");
        LAge.setBounds(30, 360, 100, 30);
        LAge.setFont(new Font("Consolas", Font.PLAIN, 15));

        JTextField age = new JTextField();
        age.setBounds(30, 385, 200, 40);
        age.setFont(new Font("Consolas", Font.PLAIN, 20));

        ImageIcon icon = new ImageIcon("D:\\Cse_110_Project\\src\\cse_110_project\\back.png");
        JButton back = new JButton(icon);
        back.setBounds(870, 455, 112, 40);
        back.setFocusable(false);

        ImageIcon adbtn = new ImageIcon("D:\\Cse_110_Project\\src\\cse_110_project\\add.png");
        JButton addbtn = new JButton(adbtn);
        addbtn.setBounds(30, 455, 112, 40);
        addbtn.setFocusable(false);
        
        ImageIcon ldelbtn = new ImageIcon("D:\\Cse_110_Project\\src\\cse_110_project\\delete.png");
        JButton delbtn = new JButton(ldelbtn);
        delbtn.setBounds(230, 455, 112, 40);
        delbtn.setFocusable(false);
        
        ImageIcon lupbtn = new ImageIcon("D:\\Cse_110_Project\\src\\cse_110_project\\update.png");
        JButton upbtn = new JButton(lupbtn);
        upbtn.setBounds(440, 455, 112, 40);
        upbtn.setFocusable(false);
        
        
        ImageIcon lclbtn = new ImageIcon("D:\\Cse_110_Project\\src\\cse_110_project\\clear.png");
        JButton clbtn = new JButton(lclbtn);
        clbtn.setBounds(660, 455, 112, 40);
        clbtn.setFocusable(false);
        
        add(delbtn);
        add(upbtn);
        add(clbtn);
        
        

        //table
        Object[] columns = {"Name", "Specialist", "Phone", "Age", "Gender"};
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(columns);

        table.setModel(model);

        table.setBackground(Color.WHITE);
        table.setForeground(Color.black);
//        Font font = new Font("",1,22);
        table.setFont(new Font("Consolas", Font.PLAIN, 15));
        table.setRowHeight(30);
        JScrollPane pane = new JScrollPane(table);
        pane.setBounds(280, 40, 700, 385);
        Object[] row = new Object[5];
        
         addbtn.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
             
                row[0] = name.getText();
                row[1] = num.getText();
                row[2] = dep.getText();
                row[3] = sex.getText();
                row[4] = age.getText();
                
                model.addRow(row);
            }
        });
         
         
         
         
           delbtn.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {      
                int i = table.getSelectedRow();
                if(i >= 0){
                    model.removeRow(i);
                }
                else{
                    System.out.println("Delete Error");
                }
            }
        });

        table.addMouseListener(new MouseAdapter(){
        @Override
        public void mouseClicked(MouseEvent e){
            int i = table.getSelectedRow();
            name.setText(model.getValueAt(i, 0).toString());
            num.setText(model.getValueAt(i, 1).toString());
            dep.setText(model.getValueAt(i, 2).toString());
            sex.setText(model.getValueAt(i, 3).toString());
            age.setText(model.getValueAt(i, 4).toString());
        }
        });
        
        
         upbtn.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                int i = table.getSelectedRow();
                if(i >= 0) 
                {
                   model.setValueAt(name.getText(), i, 0);
                   model.setValueAt(num.getText(), i, 1);
                   model.setValueAt(dep.getText(), i, 2);
                   model.setValueAt(sex.getText(), i, 3);
                   model.setValueAt(age.getText(), i, 3);
                }
                else{
                    System.out.println("Update Fail");
                }
            }
        });
         
         
         clbtn.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                name.setText("");
                pass.setText("");
                num.setText("");
                dep.setText("");
                sex.setText("");
                age.setText("");
            }
        });
         
         
         back.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                new AdminDash().setVisible(true);
                setVisible(false);
            }
        });
         


         
         
        
 


        add(pane);

        add(addbtn);
        add(back);
        add(pass);
        add(LAge);
        add(sex);
        add(Lname);
        add(Lgen);
        add(dep);
        add(Lsec);
       add(num);
        add(Lnum);
       add(age);
        add(Aname);
        add(name);

        setVisible(true);
    }
    
    
    



}
