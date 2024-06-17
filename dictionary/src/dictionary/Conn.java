
package dictionary;

import java.sql.*;

public class Conn {
    
  Connection con;
  Statement s;
 Conn()
 {
     try
     {
        Class.forName("com.mysql.cj.jdbc.Driver"); 
        con=DriverManager.getConnection("jdbc:mysql:///dictionaryapp","root","JYOTI12345678JK");
        s=con.createStatement();
     
     }
     catch(Exception e)
     {
         e.printStackTrace();
     }
 }
}