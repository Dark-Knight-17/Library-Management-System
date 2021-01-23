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

public class LibrarianPage {
    public void LibrarianPage(JFrame Frame,String name)
            
            
    {
        
        
   JPanel f3=new JPanel( );
        f3.setLayout(null);
        
        JLabel lbl=new JLabel("Welcome Librarian "+name+" !");
        JButton adB=new JButton("Add Books");
        JButton vB=new JButton("View Books");
        JButton iB=new JButton("Issue Books");
        JButton viB=new JButton("View Issued Books");
        JButton rB=new JButton("Return Book");
        JButton remB=new JButton("Remove A Book from Library");
        JButton out=new JButton("Logout");
        
        
        lbl.setFont(new Font("Helvetica ",Font.PLAIN,50));
        adB.setFont(new Font("Helvetica ",Font.PLAIN,30));
        vB.setFont(new Font("Helvetica ",Font.PLAIN,30));
        iB.setFont(new Font("Helvetica ",Font.PLAIN,30));
        viB.setFont(new Font("Helvetica ",Font.PLAIN,30));
        rB.setFont(new Font("Helvetica ",Font.PLAIN,30));
        remB.setFont(new Font("Helvetica ",Font.PLAIN,30));
        out.setFont(new Font("Helvetica ",Font.PLAIN,30));
        
        
       lbl.setBounds(640,80,800,50);
       adB.setBounds(710,200,450,50);
       vB.setBounds(710,300,450,50);
      iB.setBounds(710,400,450,50);
       viB.setBounds(710,500,450,50);
       rB.setBounds(710,600,450,50);
       remB.setBounds(710,700,450,50);
       out.setBounds(710,800,450,50);
       
      
       adB.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
                           // SQL CODE HERE 
                           lbl.setText(" Add Books feature Coming soon");
                        }});
       vB.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
                           // SQL CODE HERE 
                           lbl.setText(" View Books feature Coming soon");
                        }});
   iB.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
                           // SQL CODE HERE 
                           lbl.setText(" Issue Book feature Coming soon");
                        }});
     viB.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
                           // SQL CODE HERE 
                           lbl.setText(" View Issued Book feature Coming soon");
                        }});
        rB.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
                           // SQL CODE HERE 
                           lbl.setText(" Return Book feature Coming soon");
                        }});
                       
                     
                       
      remB.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
                           // SQL CODE HERE 
                           lbl.setText(" Remove book feature Coming soon");
                        }});
      
       out.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
                            f3.setVisible(false);
                            FirstPage fp=new FirstPage();
                            fp.FirstPage();}
        }
        );
       
      
       f3.add(lbl);
       f3.add(adB);
        f3.add(vB);
        f3.add(iB);
        f3.add(viB);
        f3.add(rB);
        f3.add(remB);
        f3.add(out);
        
        JButton close=new JButton("Close All Tabs and Exit");
     close.setFont(new Font("Helvetica ",Font.PLAIN,30));
     close.setBounds(710,900,450,50);
     close.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
                           Frame.dispose();
                           System.exit(0);
        }}
        );
     f3.add(close);
        
        
           f3.setVisible(true);
           
          Frame.add(f3);
          
                
                
    }
    
}
