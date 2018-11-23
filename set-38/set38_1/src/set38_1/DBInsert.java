/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package set38_1;

/**
 *
 * @author abhil
 */
import java.sql.*;
public class DBInsert {
 
    public boolean insertDB(String r, String n, String p)
    {
        boolean flag = false;
        
        try{
        // Driver
        Class.forName("com.mysql.jdbc.Driver").newInstance();
        // Connection
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentinfo","root","root");
        // Statement    
        Statement st = conn.createStatement();
        //    
        String query = "Insert into student values ('"+r+"','"+n+"','"+p+"')";
            int x = st.executeUpdate(query);
            
            if(x>0)
                flag = true;
        }
        catch (Exception ex)
        {
            System.out.println("Error in class InsertConn "+ex);
        }
        
        return flag;
    }
}
