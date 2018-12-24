/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StaffOperations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *
 * @author abhil
 */
public class StaffCredsUpdateMaker {
    
    public boolean updateStaffCreds(String username, String password)
    {
        boolean f = false;
        
        try {
            
            // Driver
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            // Connection
            Connection conn =  DriverManager.getConnection("jdbc:mysql://localhost:3306/rashandb", "myadm", "Myadm@123");
            //Connection conn =  DriverManager.getConnection("jdbc:mysql://localhost:3306/rashandb", "root", "root");
            // Statement
            Statement st = conn.createStatement();
            
            String query = "update staffinfo set pass='"+password+"' where uname='"+username+"'";
            int x = st.executeUpdate(query);
            
            if(x>0)
                f = true;
            
        } catch (Exception e) {
            System.out.println("Error in class StaffCredsUpdateMaker");
            System.out.println(e);
        }
        
        return f;
    }
}
