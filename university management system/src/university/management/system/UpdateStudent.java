
package university.management.system;

import javax.swing.*;
import java.awt.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;
import java.sql.*;
        
public class UpdateStudent extends JFrame implements ActionListener{
    
    JTextField tfcourse,tfemail,tfphone,tfaddress,tfbranch;
    JLabel labelrollno;
    JButton  submit,cancel;
    Choice crollno;
    
   
    UpdateStudent()
    {
        setSize(900,650);
        setLocation(250,50);
        setLayout(null);
        
        JLabel heading= new JLabel("Update Student Details");
        heading.setBounds(50,10,500,50);
        heading.setFont(new Font("Tahoma",Font.ITALIC,35));
        add(heading);
        
        JLabel lblrollnumber=new JLabel("Select Roll Number");
        lblrollnumber.setBounds(50,100,200,20);
        lblrollnumber.setFont(new Font("serif",Font.PLAIN,20));
        add(lblrollnumber);
        
        crollno=new Choice();
        crollno.setBounds(250,100,200,20);
        add(crollno);
        
        try{
            Conn c=new Conn();
            ResultSet rs=c.s.executeQuery("select * from stu");
            while(rs.next()){
                crollno.add(rs.getString("Rollno"));
            }
        }catch(Exception e)
        {
         e.printStackTrace();   
        }
        
        JLabel lblname= new JLabel("Name");
        lblname.setBounds(50,150,100,30);
        lblname.setFont(new Font("Serif",Font.BOLD,20));
        add(lblname);
        
        JLabel labelname=new JLabel();
        labelname.setBounds(200,150,150,30);
        labelname.setFont(new Font("Tahoma",Font.PLAIN,18));
        add(labelname);
        
        
        JLabel lblfname= new JLabel("Father's Name");
        lblfname.setBounds(400,150,200,30);
        lblfname.setFont(new Font("Serif",Font.BOLD,20));
        add(lblfname);
        
        JLabel labelfname=new JLabel();
        labelfname.setBounds(600,150,150,30);
        labelfname.setFont(new Font("Tahoma",Font.PLAIN,18));
        add(labelfname);
        
        JLabel lblrollno= new JLabel("Roll Number");
        lblrollno.setBounds(50,200,200,30);
        lblrollno.setFont(new Font("Serif",Font.BOLD,20));
        add(lblrollno);
        
        labelrollno= new JLabel();
        labelrollno.setBounds(200,200,200,30);
        labelrollno.setFont(new Font("Tahoma",Font.PLAIN,18));
        add(labelrollno);
        
        JLabel lbldob= new JLabel("Date of Birth");
        lbldob.setBounds(400,200,200,30);
        lbldob.setFont(new Font("Serif",Font.BOLD,20));
        add(lbldob);
        
        JLabel labeldob=new JLabel();
        labeldob.setBounds(600,200,150,30);
        labeldob.setFont(new Font("Tahoma",Font.PLAIN,18));
        add(labeldob);
        
        JLabel lbladdress= new JLabel("Address");
        lbladdress.setBounds(50,250,200,30);
        lbladdress.setFont(new Font("Serif",Font.BOLD,20));
        add(lbladdress);
        
        tfaddress= new JTextField();
        tfaddress.setBounds(200,250,150,30);
        add(tfaddress);
        
        JLabel lblphn= new JLabel("Phone");
        lblphn.setBounds(400,250,200,30);
        lblphn.setFont(new Font("Serif",Font.BOLD,20));
        add(lblphn);
        
        tfphone= new JTextField();
        tfphone.setBounds(600,250,150,30);
        add(tfphone);
        
        JLabel lblemail= new JLabel("Email Id");
        lblemail.setBounds(50,300,200,30);
        lblemail.setFont(new Font("Serif",Font.BOLD,20));
        add(lblemail);
        
        tfemail= new JTextField();
        tfemail.setBounds(200,300,150,30);
        add(tfemail);
        
        JLabel lblx= new JLabel("Class X (%)");
        lblx.setBounds(400,300,150,30);
        lblx.setFont(new Font("Serif",Font.BOLD,20));
        add(lblx);
        
        JLabel labelx= new JLabel();
        labelx.setBounds(600,300,150,30);
        labelx.setFont(new Font("Tahoma",Font.PLAIN,18));
        add(labelx);
        
        JLabel lblxii= new JLabel("Class XII (%)");
        lblxii.setBounds(50,350,200,30);
        lblxii.setFont(new Font("Serif",Font.BOLD,20));
        add(lblxii);
        
        JLabel labelxii= new JLabel();
        labelxii.setBounds(200,350,150,30);
        labelxii.setFont(new Font("Tahoma",Font.PLAIN,18));
        add(labelxii);
        
        
        JLabel lbladhar= new JLabel("Aadhar Number");
        lbladhar.setBounds(400,350,200,30);
        lbladhar.setFont(new Font("Serif",Font.BOLD,20));
        add(lbladhar);
        
        JLabel labeladhar= new JLabel();
        labeladhar.setBounds(600,350,150,30);
        labeladhar.setFont(new Font("Tahoma",Font.PLAIN,18));
        add(labeladhar);
        
        JLabel lblcourse= new JLabel("Course");
        lblcourse.setBounds(50,400,200,30);
        lblcourse.setFont(new Font("Serif",Font.BOLD,20));
        add(lblcourse);
        
        tfcourse=new JTextField();
        tfcourse.setBounds(200,400,150,30);
        add(tfcourse);
        
        
        JLabel lblbranch= new JLabel("Branch");
        lblbranch.setBounds(400,400,200,30);
        lblbranch.setFont(new Font("Serif",Font.BOLD,20));
        add(lblbranch);
        
        tfbranch=new JTextField();
        tfbranch.setBounds(600,400,150,30);
        add(tfbranch);
        
        try{
            Conn c=new Conn();
            String query="select * from stu where Rollno='"+crollno.getSelectedItem()+"'";
            ResultSet rs=c.s.executeQuery(query);
            while(rs.next()){
                labelname.setText(rs.getString("Name"));
                labelfname.setText(rs.getString("Fname"));
                labeldob.setText(rs.getString("DOB"));
                tfaddress.setText(rs.getString("Address"));
                tfphone.setText(rs.getString("Phone"));
                tfemail.setText(rs.getString("Email"));
                labelx.setText(rs.getString("Class_x"));
                labelxii.setText(rs.getString("Class_xii"));
                labeladhar.setText(rs.getString("Aadhar"));
                labelrollno.setText(rs.getString("Rollno"));
                tfcourse.setText(rs.getString("Course"));
                tfbranch.setText(rs.getString("Branch"));
             
                            
            }
        }catch(Exception e){
        e.printStackTrace();
    }
        
        crollno.addItemListener(new ItemListener(){
            
        public void itemStateChanged(ItemEvent ie){
            
             try{
            Conn c=new Conn();
            String query="select * from stu where Rollno='"+crollno.getSelectedItem()+"'";
            ResultSet rs=c.s.executeQuery(query);
            while(rs.next()){
                labelname.setText(rs.getString("Name"));
                labelfname.setText(rs.getString("Fname"));
                labeldob.setText(rs.getString("DOB"));
                tfaddress.setText(rs.getString("Address"));
                tfphone.setText(rs.getString("Phone"));
                tfemail.setText(rs.getString("Email"));
                labelx.setText(rs.getString("Class_x"));
                labelxii.setText(rs.getString("Class_xii"));
                labeladhar.setText(rs.getString("Aadhar"));
                labelrollno.setText(rs.getString("Rollno"));
                tfcourse.setText(rs.getString("Course"));
                tfbranch.setText(rs.getString("Branch"));
             
                            
            }
        }catch(Exception e){
        e.printStackTrace();
    }
    }
        
        });
        
        submit=new JButton("Update");
        submit.setBounds(250,500,120,30);
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.white);
        submit.addActionListener(this);
        submit.setFont(new Font("Tahoma",Font.BOLD,15));
        add(submit);
        
        cancel=new JButton("Cancel");
        cancel.setBounds(450,500,120,30);
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.white);
        cancel.addActionListener(this);
        cancel.setFont(new Font("Tahoma",Font.BOLD,15));
        add(cancel);
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource() == submit)
        {
          
          String rollno=labelrollno.getText();
          String address=tfaddress.getText();
          String phone=tfphone.getText();
          String email=tfemail.getText();
          String course=tfcourse.getText();
          String branch=tfbranch.getText();
          
          try{
              
              String query="update stu set Address='"+address+"',Phone='"+phone+"',Email='"+email+"',Course='"+course+"',Branch='"+branch+"' where Rollno='"+rollno+"'";
          
              Conn con=new Conn();
              con.s.executeUpdate(query);
              
              JOptionPane.showMessageDialog(null,"Student Details Inserted Successfully");
              setVisible(false);
              
          }catch(Exception e)
          {
              e.printStackTrace();
          }
          
        }else{
            setVisible(false);
        }
    }
   
    
    public static void main(String[] args)
    {
     new UpdateStudent();
    }
}
