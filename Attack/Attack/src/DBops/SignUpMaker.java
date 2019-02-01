/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DBops;
import java.sql.*;
/**
 *
 * @author abhilash
 */
public class SignUpMaker {
    
    public boolean insertSignUp(String name, String email, String mobile, String uname, String pass)
    {
        boolean f = false;
        
        try {
            // Driver
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            // Connection
            Connection conn =  DriverManager.getConnection("jdbc:mysql://localhost:3306/networknode", "myadm", "Myadm@123");
            //Connection conn =  DriverManager.getConnection("jdbc:mysql://localhost:3306/rashandb", "root", "root");
            
            // Statement
            Statement st = conn.createStatement();
            
            String q = "insert into nodeinfo values ('"+name+"','"+email+"','"+mobile+"','"+uname+"','"+pass+"')";

            int x = st.executeUpdate(q);
            
            if(x>0)
                f = true;
            
        } catch (Exception e) {
            System.out.println("Error in class SingUpMaker: "+e);
        }
        
        return f;
    }
}
