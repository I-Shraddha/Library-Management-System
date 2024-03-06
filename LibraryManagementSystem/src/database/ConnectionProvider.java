
package database;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;


public class ConnectionProvider {
    
    public  static Connection con;
    public static Statement st;
    
    static{
    try{
     Class.forName("com.mysql.jdbc.Driver");
     con=DriverManager.getConnection("jdbc:mysql://localhost:3306/lib_ManSys", "root", "Root123");
           st=con.createStatement();
      }catch(Exception e){

       }
    }
}
