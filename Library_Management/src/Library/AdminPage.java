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

public class AdminPage {
    public void AdminPage(JFrame Frame,String name)
            
            
    {
        JPanel f2=new JPanel();
        f2.setLayout(null);
        
        JLabel lbl=new JLabel("Welcome Admin "+name+" !");
        JButton adLib=new JButton("Add Librarian");
        JButton vLib=new JButton("View Librarians");
        JButton dLib=new JButton("Delete Librarian");
        JButton out=new JButton("Logout");
        
        lbl.setFont(new Font("Helvetica ",Font.PLAIN,50));
        adLib.setFont(new Font("Helvetica ",Font.PLAIN,30));
        vLib.setFont(new Font("Helvetica ",Font.PLAIN,30));
        dLib.setFont(new Font("Helvetica ",Font.PLAIN,30));
        out .setFont(new Font("Helvetica ",Font.PLAIN,30));
        
        
        lbl.setBounds(720,120,800,50);
        adLib.setBounds(780,300,350,50);
        vLib.setBounds(780,400,350,50);
      dLib.setBounds(780,500,350,50);
       out.setBounds(780,600,350,50);
       
       
       adLib.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
                           // SQL CODE HERE 
                           lbl.setText(" Add Librarian feature Coming soon");
                        }});
       
       
       
       vLib.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
                           // SQL CODE HERE 
                           lbl.setText(" View Librarian feature Coming soon");
                        }});
    
       
       
       dLib.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
                           // SQL CODE HERE 
                           lbl.setText(" Delete Librarian feature Coming soon");
                        }});
       
       
       out.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
                            f2.setVisible(false);
                            FirstPage fp=new FirstPage();
                            fp.FirstPage();}
        }
        );
       
       
       
                
       f2.add(lbl);
       f2.add(adLib);
        f2.add(vLib);
        f2.add(dLib);
        f2.add(out);
        
        JButton close=new JButton("Close All Tabs and Exit");
     close.setFont(new Font("Helvetica ",Font.PLAIN,30));
     close.setBounds(780,700,350,50);
     close.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
                           Frame.dispose();
                           System.exit(0);
        }}
        );
     f2.add(close);
        
          Frame.add(f2);
          
                
                
    }
    
}
