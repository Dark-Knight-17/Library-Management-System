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
import javax.swing.JFrame;
import javax.swing.JPanel;


class FirstPage extends JFrame {
   
    
   public static void  FirstPage()
   {
        JFrame Frame=new JFrame("Library Management System - Developed by Developer.39");

    
 JPanel f = new JPanel();

   
     f.setLayout(null);
     Frame.setResizable(false);
    
       
       Frame.setSize(1920,1080);
       JButton adminBt=new JButton("Admin Login");
       JButton librarianBt=new JButton("Librarian Login");
       JLabel firstLB=new JLabel("Welcome to the Login Page");
       
       librarianBt.setFont(new Font("Helvetica ",Font.PLAIN,15)); 
       adminBt.setFont(new Font("Helvetica ",Font.PLAIN,15));
       firstLB.setFont(new Font("Helvetica ",Font.PLAIN,50));
       firstLB.setBounds(335,200, 800,450);
       adminBt.setBounds(335, 550, 250, 50);
       librarianBt.setBounds(335,750, 250, 50);

       
       
       adminBt.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
                            f.setVisible(false);
                            adL ad= new adL();
                            ad.adL(Frame);
                        }});
       librarianBt.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
                            f.setVisible(false);
                            Lb lb=new Lb();
                          //  lb.Lb(Frame);
                             }});
       JButton change=new JButton("Change Wallpaper");
     change.setFont(new Font("Helvetica ",Font.PLAIN,15));
     JButton next=new JButton("Next");
     JButton wh=new JButton(" ? ");
     JButton about=new JButton("About Developer");
     about.setFont(new Font("Helvetica ",Font.PLAIN,15));
     about.setBounds(1600, 560,200, 50);
     about.addActionListener(new ActionListener(){
			public  void actionPerformed(ActionEvent ae){
                          // lb.setText("You selected "+m1.getText());
                          About ab= new About();
                          ab.About(Frame,f);
                           ;
        }}
        );
     f.add(about);
        f.add(firstLB);
        f.add( adminBt);
        f.add(librarianBt);

   
       f.setVisible(true);
      Frame.add(f);
      Frame.setVisible(true);
   
   
   
   } 
  
   
   public static  void main(String ar[]){
       FirstPage f=new FirstPage();
       f.FirstPage();
   }
   
        
}

