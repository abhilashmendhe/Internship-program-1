/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crypto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *
 * @author abhil
 */
public class SignUpUpdateMaker {
    
    public boolean signupupdate(String name, String dob, String email, String mobile, String uname, String pass)
    {
        boolean f = false;
        // name, dob, email, mobile, uname, pass
        try {
            // Driver
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            // Connection
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/armstrongdb", "root", "root");
            // Statement
            Statement st = conn.createStatement();
            
            String query = "update armstrongprofile set name='"+name+"', dob='"+dob+"', email='"+email+"', mobile='"+mobile+"', pass='"+pass+"' where uname='"+uname+"'";
            int x = st.executeUpdate(query);
            if(x>0)
                f = true;
            
        } catch (Exception e) {
            System.out.println("Error in class SignUpUpdateMaker: "+e);
        }
        
        return f;
        
    }
}
