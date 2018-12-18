/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank;

/**
 *
 * @author abhil
 */
import java.sql.*;
public class SignUpMaker {
    
    
    public boolean signup(String name, String dob, String email, String address, String username, String password)
    {
        boolean f = false;
        
        try{
            // Driver
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            
            // Connection
            String url = "jdbc:mysql://localhost:3306/bankdb";
            Connection conn = DriverManager.getConnection(url, "root", "Asimov@1234");
            
            // Statement
            Statement st = conn.createStatement();
            
            String query = "Insert into empinfo values ('"+name+"','"+dob+"','"+email+"','"+address+"','"+username+"','"+password+"')";
            int x = st.executeUpdate(query);
            
            if(x>0)
                f = true;
            
        }
        catch(Exception e)
        {
            System.out.println("Error in class SignUpMaker: "+e);
        }
        
        return f;
    }
}
