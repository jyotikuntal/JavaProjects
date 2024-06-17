
package university.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Project extends JFrame implements ActionListener {
    
    Project()
    {
        setSize(1540,900);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/third.jpg"));
        Image i2=i1.getImage().getScaledInstance(1500,700,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        //image.setBounds(350,0,200,200);
        add(image);
        
        JMenuBar mb= new JMenuBar();
       
        //new information
        JMenu newInformation =new JMenu("New Information");
        newInformation.setForeground(Color.blue);
        mb.add(newInformation);
        
        JMenuItem FacultyInfo=new JMenuItem("New Faculty Information");
        FacultyInfo.setBackground(Color.white);
        FacultyInfo.addActionListener(this);
        newInformation.add(FacultyInfo);
        
        JMenuItem StudentInfo=new JMenuItem("New Student Information");
        StudentInfo.setBackground(Color.white);
        StudentInfo.addActionListener(this);
        newInformation.add(StudentInfo);
        
        //details
        JMenu details =new JMenu("View Details");
        details.setForeground(Color.red);
        mb.add(details);
        
        JMenuItem Facultydetails=new JMenuItem("View Faculty Details");
        Facultydetails.setBackground(Color.white);
        Facultydetails.addActionListener(this);
        details.add(Facultydetails);
        
        JMenuItem Studentdetails=new JMenuItem("View Student Details");
        Studentdetails.setBackground(Color.white);
        Studentdetails.addActionListener(this);
        details.add(Studentdetails);
        
         //leave
        JMenu leave =new JMenu("Apply Leave");
        leave.setForeground(Color.blue);
        mb.add(leave);
        
        JMenuItem Facultyleave=new JMenuItem("Faculty leave");
        Facultyleave.setBackground(Color.white);
        Facultyleave.addActionListener(this);
        leave.add(Facultyleave);
        
        JMenuItem Studentleave=new JMenuItem("Student leave");
        Studentleave.setBackground(Color.white);
        Studentleave.addActionListener(this);
        leave.add(Studentleave);
       
       
             //leavedetails
        JMenu leavedetails =new JMenu("Leave Details ");
        leavedetails .setForeground(Color.RED);
        mb.add(leavedetails );
        
        JMenuItem Facultyleavedetails =new JMenuItem("Faculty Leave Details");
        Facultyleavedetails .setBackground(Color.white);
        Facultyleavedetails.addActionListener(this);
        leavedetails .add(Facultyleavedetails );
        
        JMenuItem Studentleavedetails =new JMenuItem("Student Leave Details");
        Studentleavedetails .setBackground(Color.white);
        Studentleavedetails.addActionListener(this);
        leavedetails .add(Studentleavedetails );
        
          //exams
        JMenu exam =new JMenu("Examination");
        exam.setForeground(Color.blue);
        mb.add(exam );
        
        JMenuItem examinationdetails =new JMenuItem("Examination Results");
        examinationdetails.setBackground(Color.white);
        examinationdetails.addActionListener(this);
        exam.add(examinationdetails);
        
        JMenuItem entermarks=new JMenuItem("Enter Marks");
        entermarks.setBackground(Color.white);
        entermarks.addActionListener(this);
        exam.add( entermarks);
        
             //updateinfo
        JMenu updateinfo =new JMenu("Update Deatils");
        updateinfo.setForeground(Color.red);
        mb.add(updateinfo );
        
        JMenuItem updatefacultyinfo=new JMenuItem("Update Faculty Details");
        updatefacultyinfo.setBackground(Color.white);
        updatefacultyinfo.addActionListener(this);
        updateinfo.add(updatefacultyinfo);
        
        JMenuItem updatestudentinfo=new JMenuItem("Update Student Details");
        updatestudentinfo.setBackground(Color.white);
        updatestudentinfo.addActionListener(this);
        updateinfo.add( updatestudentinfo);
        
                //fees
        JMenu fees=new JMenu("Fee Details");
        fees.setForeground(Color.blue);
        mb.add(fees );
        
        JMenuItem feestructure =new JMenuItem("Fee Structure");
        feestructure.setBackground(Color.white);
        feestructure.addActionListener(this);
        fees.add(feestructure);
        
        JMenuItem feeform=new JMenuItem("Student Fee Form");
        feeform.setBackground(Color.white);
        feeform.addActionListener(this);
        fees.add(feeform);
     
           
                  //utility
        JMenu utility=new JMenu("Utility");
        utility.setForeground(Color.red);
        mb.add(utility);
        
        JMenuItem notepad =new JMenuItem("Notepad");
        notepad.setBackground(Color.white);
        notepad.addActionListener(this);
        utility.add(notepad);
        
        JMenuItem calc=new JMenuItem("Calculator");
        calc.setBackground(Color.white);
        calc.addActionListener(this);
        utility.add(calc);
        
        
                     //about
        JMenu about=new JMenu("About");
        about.setForeground(Color.blue);
        mb.add(about);
        
        JMenuItem ab=new JMenuItem("About Us");
        ab.setBackground(Color.white);
        ab.addActionListener(this);
        about.add(ab);
        
               
        

        //exit
        JMenu exit=new JMenu("Exit");
        exit.setForeground(Color.red);
        mb.add(exit);
        
        JMenuItem ex=new JMenuItem("Exit");
        ex.setBackground(Color.white);
        ex.addActionListener(this);
        exit.add(ex);
        
        
        setJMenuBar(mb);
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae)
    {
        String msg=ae.getActionCommand();
        
        if(msg.equals("Exit"))
        {
       setVisible(false);
        }
        else if(msg.equals("Calculator"))
        {
         try{
             Runtime.getRuntime().exec("calc.exe");
         }catch(Exception e)
         {
             
         }
        }  else if(msg.equals("Notepad"))
        {
         try{
             Runtime.getRuntime().exec("notepad.exe");
         }catch(Exception e)
         {
             
         }
        
         }
        else if(msg.equals("New Faculty Information")){
        new AddTeacher();
         }else if (msg.equals("New Student Information")){
        new AddStudent();
         }else if(msg.equals("View Faculty Details")){
        new TeacherDetails();
         }else if(msg.equals("View Student Details")){
        new StudentDetails();
          }else if(msg.equals("Faculty leave")){
        new TeacherLeave();
          }else if(msg.equals("Student leave")){
        new StudentLeave();
          }else if(msg.equals("Faculty Leave Details")){
        new TeacherLeaveDetails();
          }else if(msg.equals("Student Leave Details")){
        new StudentLeaveDetails();
          }else if(msg.equals("Update Faculty Details")){
        new UpdateTeacher();
          }else if(msg.equals("Update Student Details")){
        new UpdateStudent();
        }else if(msg.equals("Enter Marks")){
        new EnterMarks();
        }else if(msg.equals("Examination Results")){
        new ExaminationDetails();
        }else if(msg.equals("Fee Structure")){
        new FeeStructure();
        }else if(msg.equals("About Us")){
        new About();
    }else if(msg.equals("Student Fee Form")){
        new StudentFeeForm();
        
    }
    }
    
    public static void main(String[] args)
    {
        new Project();
    }
}
