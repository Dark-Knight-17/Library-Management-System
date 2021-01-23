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


public class About extends JFrame {
    public void About(JFrame Frame,JPanel pan){
        
        
        pan.setVisible(false);
        JPanel about=new JPanel();
        about.setVisible(true);
        about.setLayout(null);
        Frame.add(about);
        JLabel name=new JLabel("Developer.39");
        JLabel line1=new JLabel("39 was My Roll Number in 12th Grade. I only do those things which I love to do ! ");
        JLabel line2=new JLabel("What about You ? ! Life is too short , So Priorities First ! ");
        JButton back=new JButton("Back");
        back.setBounds(1600, 860,300, 60);
        back.addActionListener(new ActionListener(){
			public  void actionPerformed(ActionEvent ae){
                          about.setVisible(false);
                                  pan.setVisible(true);

        }}
        );
     
         JLabel line3=new JLabel("My Email Addresses , You are free to contact me at anytime  :-)");
         JLabel eO=new JLabel(" developer.39@outlook.com");//email id of outlook
         JLabel eG=new JLabel(" csgroup39@gmail.com");//email id of gmail
         
           
     name.setFont(new Font("Helvetica ",Font.PLAIN,120));
     line1.setFont(new Font("Helvetica ",Font.PLAIN,40));
    line2.setFont(new Font("Helvetica ",Font.PLAIN,40));
    line3.setFont(new Font("Helvetica ",Font.PLAIN,40));
    back.setFont(new Font("Helvetica ",Font.PLAIN,30));
  
   
     eO.setFont(new Font("Helvetica ",Font.PLAIN,40));
     eG.setFont(new Font("Helvetica ",Font.PLAIN,40));
    
      
        name.setBounds(100,50,1000,200);
        line1.setBounds(150,400,1600,70);
        line2.setBounds(150,500,1600,70);
        line3.setBounds(150,600,1600,70);
        eO.setBounds(150,700,1600,70);
       
        eG.setBounds(150,800,1600,70);
       about.add(back);
        about.add(line1);
        about.add(line2);
        about.add(line3);
    
         about.add(eO);
          about.add(eG);
          about.add(name);
          Frame.add(about);
       
    
}
   }
