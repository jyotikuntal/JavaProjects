
package university.management.system;


import javax.swing.*;
import java.awt.*;

public class About extends JFrame{
    
    About(){
        
        
        setSize(700,550);
        setLocation(310,150);
        
        
        getContentPane().setBackground(Color.WHITE);
        
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/about.jpg"));
        Image i2=i1.getImage().getScaledInstance(300,200,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(350,0,300,200);
        add(image);
        
        JLabel heading= new JLabel("<html>College<br/> Management System<html>");
        heading.setBounds(70,40,300,130);
        heading.setFont(new Font("Tahoma",Font.BOLD,35));
        heading.setForeground(Color.BLUE);
        add(heading);
        
        JLabel name= new JLabel("Developed By : Jyoti Kuntal");
        name.setBounds(70,220,550,40);
        name.setFont(new Font("Tahoma",Font.BOLD,25));
        add(name);
        
        JLabel rollno= new JLabel("Roll No : 2200650140013");
        rollno.setBounds(70,280,550,40);
        rollno.setFont(new Font("Tahoma",Font.PLAIN,20));
        add(rollno);
        
        JLabel contact= new JLabel("Contact : jyotikuntal2516@gmail.com");
        contact.setBounds(70,340,550,40);
        contact.setFont(new Font("Tahoma",Font.PLAIN,20));
        add(contact);
        
        JLabel education= new JLabel("Education : Master of Computer Application");
        education.setBounds(70,400,550,40);
        education.setFont(new Font("Tahoma",Font.PLAIN,20));
        add(education);
        
       
        setLayout(null);
        
        setVisible(true);
    }
    
    
    public static void main(String[] args){
        
       new  About();
    }
}
