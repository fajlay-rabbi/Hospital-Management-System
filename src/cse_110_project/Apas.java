package cse_110_project;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Apas extends JFrame{
    
    
//    String header[] = new String[]{"Name", "Disease", "Phone", "Address", "Gender","Age"};
//    DefaultTableModel model;
//    int row,col;
    
    
    
    

    
    JTable table1 = new JTable();
    public Object[] row = new Object[6];
    
    Apas(){
        setTitle("Hospital Managment System");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setSize(1100, 630);
        setResizable(false);
        setLocation(130, 50);
        
        
//        tData = new ArrayList<>();
//        model = new DefaultTableModel(header,0);
//        table1.setModel(model);
        

        JLabel Lname = new JLabel("Name:");
        Lname.setBounds(30, 10, 80, 30);
        Lname.setFont(new Font("Consolas", Font.PLAIN, 15));
        
        
        JTextField name = new JTextField();
        name.setBounds(30, 40, 200, 40);
        name.setFont(new Font("Consolas", Font.PLAIN, 20));


        JLabel Aname = new JLabel("Disease:");
        Aname.setBounds(30, 80, 80, 30);
        Aname.setFont(new Font("Consolas", Font.PLAIN, 15));

        JTextField disease = new JTextField();
        disease.setBounds(30, 108, 200, 40);
        disease.setFont(new Font("Consolas", Font.PLAIN, 20));

        JLabel Lnum = new JLabel("Phone:");
        Lnum.setBounds(30, 150, 80, 30);
        Lnum.setFont(new Font("Consolas", Font.PLAIN, 15));

        JTextField num = new JTextField();
        num.setBounds(30, 180, 200, 40);
        num.setFont(new Font("Consolas", Font.PLAIN, 20));

        JLabel Laddress = new JLabel("Address:");
        Laddress.setBounds(30, 220, 100, 30);
        Laddress.setFont(new Font("Consolas", Font.PLAIN, 15));

        JTextField address = new JTextField();
        address.setBounds(30, 250, 200, 40);
        address.setFont(new Font("Consolas", Font.PLAIN, 20));

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
        
        
        
        
        //table
        Object[] columns = {"Name", "Disease", "Phone", "Address", "Gender","Age"};
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(columns);

        table1.setModel(model);

        table1.setBackground(Color.WHITE);
        table1.setForeground(Color.black);
        table1.setFont(new Font("Consolas", Font.PLAIN, 15));
        table1.setRowHeight(30);
        JScrollPane pane = new JScrollPane(table1);
        pane.setBounds(280, 40, 700, 385);
        
        
         addbtn.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                
                row[0] = name.getText();
                row[1] = disease.getText();
                row[2] = num.getText();
                row[3] = address.getText();
                row[4] = sex.getText();
                row[5] = age.getText();
                model.addRow(row);
                
//                String pname = name.getText();
//                String pdis = disease.getText();
//                String pnum = num.getText();
//                String padd = address.getText();
//                String psex = sex.getText();
//                String page = age.getText(); 
//                
//                tData.add(new FechTableData(pname,pdis,pnum,padd,psex,page));
//                model.setRowCount(0);
//                for (int i = 0; i < tData.size(); i++) {
//                    Object[] objs = {tData.get(i).name, tData.get(i).disease, tData.get(i).num, tData.get(i).address, tData.get(i).sex, tData.get(i).age};
//                    model.addRow(objs);
//                }
                

             
//                pass data
//                String pname = name.getText();
//                String pdis = disease.getText();
//                String pnum = num.getText();
//                String padd = address.getText();
//                String psex = sex.getText();
//                String page = age.getText(); 
//                new DocP(pname, pdis, pnum, padd, psex, page).setVisible(false);
            }
        });
        
         
         
            delbtn.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {      
                int i = table1.getSelectedRow();
                if(i >= 0){
                    model.removeRow(i);
                }
                else{
                    System.out.println("Delete Error");
                }
            }
        });

        table1.addMouseListener(new MouseAdapter(){
        @Override
        public void mouseClicked(MouseEvent e){
            int i = table1.getSelectedRow();
            name.setText(model.getValueAt(i, 0).toString());
            disease.setText(model.getValueAt(i, 1).toString());
            num.setText(model.getValueAt(i, 2).toString());
            address.setText(model.getValueAt(i, 3).toString());
            sex.setText(model.getValueAt(i, 4).toString());
            age.setText(model.getValueAt(i, 5).toString());
        }
        });
        
        
         upbtn.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                int i = table1.getSelectedRow();
                if(i >= 0) 
                {
                   model.setValueAt(name.getText(), i, 0);
                   model.setValueAt(disease.getText(), i, 1);
                   model.setValueAt(num.getText(), i, 2);
                   model.setValueAt(address.getText(), i, 3);
                   model.setValueAt(sex.getText(), i, 3);
                   model.setValueAt(age.getText(), i, 4);
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
                disease.setText("");
                num.setText("");
                address.setText("");
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
        add(delbtn);
        add(upbtn);
        add(clbtn);
        add(addbtn);
        add(back);
        add(disease);
        add(LAge);
        add(sex);
        add(Lname);
        add(Lgen);
        add(address);
        add(Laddress);
        add(num);
        add(Lnum);
        add(age);
        add(Aname);
        add(name);
        setVisible(true);
    }
}
