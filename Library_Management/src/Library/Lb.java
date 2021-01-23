/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Library;

/**
 *
 * @author M
 */
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class Lb {
    void Lb(JFrame Frame,JPanel p){
        p.setVisible(false);
        JPanel f1 = new JPanel();
      f1.setLayout(null);
        
        
        JLabel l1=new JLabel("Librarian Login Page");
        l1.setFont(new Font("Helvetica ",Font.PLAIN,50));
        JLabel name=new JLabel("Enter Your UserName");
        name.setFont(new Font("Helvetica ",Font.PLAIN,30));
        JLabel password=new JLabel("Enter Your Password");
        password.setFont(new Font("Helvetica ",Font.PLAIN,30));
        
        JTextField Name=new JTextField();
        JPasswordField Password=new JPasswordField();
        
        JButton login=new JButton("Login and Continue");
        JButton back=new JButton("Previous Page");
        login.setFont(new Font("Helvetica ",Font.PLAIN,15));
        back.setFont(new Font("Helvetica ",Font.PLAIN,15));
        
        
        
        
        login.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
                            String un=Name.getText();
                            String pwd=String.valueOf(Password.getPassword());
                            System.out.println("Username of Librarian is "+un);
                            System.out.println("Password of "+un+" is "+pwd);
            // SQL CODE TO COME YET
                            f1.setVisible(false);
                            LibrarianPage lb=new LibrarianPage();
                            lb.LibrarianPage(Frame,un);}});
        
        back.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
                            f1.setVisible(false);
                            FirstPage fp=new FirstPage();
                            fp.FirstPage();}
        }
        );
        
       l1.setBounds(335,200, 600,450);
      name.setBounds(335, 550, 350, 50);
       Name.setBounds(640,560, 200,30);
    password.setBounds(335,650,350,50);
    Password.setBounds(640,660,200,30);
   login.setBounds(335,770,200,40);
  back.setBounds(645,770, 200,40);
   
        
        
     f1.add(l1);
     f1.add(name);
     f1.add(password);
     f1.add(login);
     f1.add(back);
     f1.add(Name);
     f1.add(Password);
     
     
    JButton close=new JButton("Close All Tabs and Exit");
     close.setFont(new Font("Helvetica ",Font.PLAIN,15));
     close.setBounds(335,850,525,40);
     close.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
                           Frame.dispose();
                           System.exit(0);
        }}
        );
     f1.add(close);
     f1.setVisible(true);
     Frame.add(f1);
     
    
    }
    
   
   
}

