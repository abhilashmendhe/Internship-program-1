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
public class DBUpdate {
      
    public boolean update(String r, String n, String p)
    {
        boolean f = false;
        
        try{
            Class.forName("com.mysql.jdbc.Driver").newInstance();
        // Connection
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentinfo","root","root");
        // Statement    
        Statement st = conn.createStatement();
        //    
        String query = "update student set name='"+n+"', percentage='"+p+"' where roll_no='"+r+"' ";
            int x = st.executeUpdate(query);
            
            if(x>0)
                f = true;
            
        }catch(Exception e)
        {
            System.out.println("Error in class DBUpdate "+e);
        }
        
        return f;
    }
}
