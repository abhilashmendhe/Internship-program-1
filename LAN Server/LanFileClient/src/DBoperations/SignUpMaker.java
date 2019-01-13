/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DBoperations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *
 * @author abhilash
 */
public class SignUpMaker {
 
    public boolean signUp(String name, String dob, String email, String address, String uid, String password)
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
            
            String query = "insert into userinfoclient values ('"+name+"', '"+dob+"', '"+email+"', '"+address+"', '"+uid+"', '"+password+"')";
            
            int x = st.executeUpdate(query);
            
            if(x>0)
                f=true;
            
        } catch (Exception e) {
            System.out.println("Error in SignUpMaker: "+e);
        }
        return f;
    }
    
}
