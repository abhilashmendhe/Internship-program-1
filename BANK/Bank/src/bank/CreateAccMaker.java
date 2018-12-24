/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank;

import java.sql.DriverManager;

/**
 *
 * @author abhil
 */
import java.sql.*;
public class CreateAccMaker {
    
    
    public boolean createacc(String accno, String custname, String dob, String address, String email, String mobile, String openbal)
    {
        boolean f = false;
        
        try {
            
            // Driver
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            
            // Connection
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankdb", "myadm", "Myadm@123");
            //Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankdb", "root", "root");
            
            // Statement
            Statement st = conn.createStatement();
            
            String query = "insert into accinfo values ('"+accno+"', '"+custname+"', '"+dob+"', '"+address+"', '"+email+"', '"+mobile+"', '"+openbal+"')";
            int x = st.executeUpdate(query);
            if(x>0)
                f = true;
            
        } catch (Exception e) {
            System.out.println("Error in class CreateAccMaker: "+e);
        }
        
        return f;
    }
}
