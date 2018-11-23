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
public class DBDelete {
    
    public boolean delete(String r)
    {
        boolean f = false;
        
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentinfo","root","root");
            
            Statement st = conn.createStatement();
            
            String q = "Delete from student where roll_no='"+r+"'";
            
            int x = st.executeUpdate(q);
            
            if(x>0)
                f = true;
            
        } catch (Exception e) {
            System.out.println("Error in class DBDelete "+e);
        }
        
        return f;
        
    }
}
