/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crypto;

/**
 *
 * @author abhil
 */
import java.sql.*;
public class SignUpMaker {
    
    public boolean signup(String name, String dob, String email, String mobile, String uname, String pass)
    {        

        // name, dob, email, mobile, uname, pass

        boolean f = false;
        
        try {
            // Driver
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            // Connection
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/armstrongdb", "root", "root");
            // Statement
            Statement st = conn.createStatement();
            
            String query = "insert into armstrongprofile values ('"+name+"', '"+dob+"', '"+email+"', '"+mobile+"', '"+uname+"', '"+pass+"')";
            int x = st.executeUpdate(query);
            if(x>0)
                f = true;
            
        } catch (Exception e) {
            System.out.println("Error in SignUpMaker: "+e);
        }
        
        return f;
    }
}
