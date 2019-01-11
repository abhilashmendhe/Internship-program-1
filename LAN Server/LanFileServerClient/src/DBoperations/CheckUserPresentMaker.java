/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DBoperations;

import com.mysql.cj.protocol.Resultset;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author abhilash
 */
public class CheckUserPresentMaker {
 
    public boolean checkUser(String uid)
    {
        boolean f = false;
        
        try {
            // Driver
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            
            // Connection
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/lanDB", "myadm", "Myadm@123");
            //Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankdb", "root", "root");
            
            // Statement
            Statement st = conn.createStatement();
            
            String query = "select * from userinfoclient where uid='"+uid+"'";
            
            ResultSet rs = st.executeQuery(query);
           
            while(rs.next())
            {
                f = true;
            }
            
        } catch (Exception e) {
            System.out.println("Error in class CheckUserPresentMaker: "+e);
        }
        
        return f;
    }
}
