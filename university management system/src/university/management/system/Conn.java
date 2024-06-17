
package university.management.system;

import java.sql.*;

public class Conn {
    
  Connection c;
  Statement s;
 Conn()
 {
     try
     {
        Class.forName("com.mysql.cj.jdbc.Driver"); 
        c=DriverManager.getConnection("jdbc:mysql:///universitymanagementsys","root","JYOTI12345678JK");
        s=c.createStatement();
     
     }
     catch(Exception e)
     {
         e.printStackTrace();
     }
 }
}
