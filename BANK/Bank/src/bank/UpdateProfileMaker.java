/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank;

import java.util.ArrayList;

/**
 *
 * @author abhil
 */
import java.sql.*;
public class UpdateProfileMaker {
    
    public boolean updateprofile(String name, String dob, String email, String address, String username, String password)
    {
        boolean f = false;
        
        try {
            
            // Driver
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            
            // Connection
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankdb","root","Asimov@1234");
            
            // Statement
            
            Statement st = conn.createStatement();
            
            String query = "update empinfo set name='"+name+"', dob='"+dob+"', email='"+email+"', address='"+address+"', pass='"+password+"' where uname='"+username+"'";
            
            int x = st.executeUpdate(query);
            if(x>0)
                f = true;
            
            
        } catch (Exception e) {
            System.out.println("Error in class UpdateProfileMaker: "+e);
        }
        
        return f;
    }
}
