package cse_110_project;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class DocP extends JFrame {
//    String name,disease,num,address,sex,age;      String name, String disease, String num, String address, String sex, String age

//    String header[] = new String[]{"Name", "Disease", "Phone", "Address", "Gender","Age"};
//    DefaultTableModel model;
//    int row,col;
    JTable table1 = new JTable();

    DocP() {
        setTitle("Hospital Managment System");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setSize(1100, 630);
        setResizable(false);
        setLocation(130, 50);

        JLabel Lname = new JLabel("Date:");
        Lname.setBounds(100, 100, 80, 30);
        Lname.setFont(new Font("Consolas", Font.PLAIN, 15));

        JTextField date = new JTextField();
        date.setBounds(100, 130, 200, 40);
        date.setFont(new Font("Consolas", Font.PLAIN, 20));

        JLabel Aname = new JLabel("Name:");
        Aname.setBounds(100, 170, 80, 30);
        Aname.setFont(new Font("Consolas", Font.PLAIN, 15));

        JTextField name = new JTextField();
        name.setBounds(100, 198, 200, 40);
        name.setFont(new Font("Consolas", Font.PLAIN, 20));

        JLabel Lnum = new JLabel("Disease:");
        Lnum.setBounds(100, 240, 80, 30);
        Lnum.setFont(new Font("Consolas", Font.PLAIN, 15));

        JTextField disease = new JTextField();
        disease.setBounds(100, 270, 200, 40);
        disease.setFont(new Font("Consolas", Font.PLAIN, 20));

        JLabel Laddress = new JLabel("Medicine:");
        Laddress.setBounds(100, 310, 100, 30);
        Laddress.setFont(new Font("Consolas", Font.PLAIN, 15));

        JTextField medicine = new JTextField();
        medicine.setBounds(100, 340, 200, 40);
        medicine.setFont(new Font("Consolas", Font.PLAIN, 20));

        JLabel Lgen = new JLabel("Par Day:");
        Lgen.setBounds(100, 380, 100, 30);
        Lgen.setFont(new Font("Consolas", Font.PLAIN, 15));

        JTextField day = new JTextField();
        day.setFont(new Font("Consolas", Font.PLAIN, 20));
        day.setBounds(100, 410, 200, 40);

        JButton print = new JButton("Print");
        print.setBounds(100, 480, 112, 40);
        print.setFocusable(false);

        JButton clear = new JButton("Clear");
        clear.setBounds(850, 480, 112, 40);
        clear.setFocusable(false);

        JTextArea area = new JTextArea();
        area.setBounds(500, 130, 460, 320);
        area.setFont(new Font("Verdana", Font.PLAIN, 15));
        

        clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                area.setText("");
                date.setText("");
                name.setText("");
                disease.setText("");
                medicine.setText("");
                day.setText("");
                
            }
        });
        
        print.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              area.setText("**********************************************\n");
              area.setText(area.getText() +"+                 \t           Doctor Prescription \t                 +\n");
              area.setText(area.getText() + "**********************************************\n");
              
              area.setText(area.getText() + "\n");
              area.setText(area.getText() + "  Date:                  \t               "+date.getText() + "\n");
              area.setText(area.getText() + "\n");
              area.setText(area.getText() + "  Name:                  \t               "+name.getText() + "\n");
              area.setText(area.getText() + "\n");
              area.setText(area.getText() + "  Disease:               \t               "+disease.getText() + "\n");
              area.setText(area.getText() + "\n");
              area.setText(area.getText() + "  Medicine:              \t               "+medicine.getText() + "\n");
              area.setText(area.getText() + "\n");
              area.setText(area.getText() + "  Per-Day:              \t                "+day.getText() + "\n");
              area.setText(area.getText() + "\n");
              area.setText(area.getText() + "********************  Get Well Soon  *************\n");
                
            }
        });

        add(clear);
        add(area);
        add(day);
        add(print);
        add(Laddress);
        add(Lgen);
        add(date);
        add(medicine);
        add(disease);
        add(Lnum);
        add(name);
        add(Aname);
        add(date);
        add(Lname);
        setVisible(true);

    }
}
//        table1.setBackground(Color.WHITE);
//        table1.setForeground(Color.black);
//        table1.setFont(new Font("Consolas", Font.PLAIN, 15));
//        table1.setRowHeight(30);
//        JScrollPane pane = new JScrollPane(table1);
//        pane.setBounds(280, 40, 700, 385);
//        model.setRowCount(0);
//        for (int i = 0; i < tData.size(); i++) {
//                Object[] objs = {tData.get(i).name, tData.get(i).disease, tData.get(i).num, tData.get(i).address, tData.get(i).sex, tData.get(i).age};
//                model.addRow(objs);
//            }
//        this.name = name;
//        this.disease = disease;
//        this.num = num;
//        this.address = address;
//        this.sex = sex;
//        this.age = age;
//        
//        tableData();
//        JTable table = new JTable();
//        Object[] columns = {"Name", "Disease", "Phone", "Address", "Gender","Age"};
//        DefaultTableModel model = new DefaultTableModel();
//        model.setColumnIdentifiers(columns);
//        table.setModel(model);
//        table.setBackground(Color.WHITE);
//        table.setForeground(Color.black);
//        table.setFont(new Font("Consolas", Font.PLAIN, 15));
//        table.setRowHeight(30);
//        JScrollPane pane = new JScrollPane(table);
//        pane.setBounds(60, 100, 975, 450);
//        add(pane);
//        model.addRow(row);
//    
//    
//    void tableData(){
//        //Table
//        JTable table = new JTable();
//        Object[] columns = {"Name", "Disease", "Phone", "Address", "Gender","Age"};
//        DefaultTableModel model = new DefaultTableModel();
//        model.setColumnIdentifiers(columns);
//        table.setModel(model);
//        table.setBackground(Color.WHITE);
//        table.setForeground(Color.black);
//        table.setFont(new Font("Consolas", Font.PLAIN, 15));
//        table.setRowHeight(30);
//        JScrollPane pane = new JScrollPane(table);
//        pane.setBounds(60, 100, 975, 450);
//        add(pane);
//        
////        Vector data = new Vector();
////        data.add(name);
////        data.add(disease);
////        data.add(num);
////        data.add(address);
////        data.add(sex);
////        data.add(age);
//        
////        model.addRow(row);
//        

