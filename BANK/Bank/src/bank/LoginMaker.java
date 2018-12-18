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
public class LoginMaker {
    
    
    public boolean login(String username, String password)
    {
        boolean f = false;
        
        try {
            // Driver
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            
            // Connection
            String url = "jdbc:mysql://localhost:3306/bankdb";
            Connection conn = DriverManager.getConnection(url, "root", "Asimov@1234");
            
            // Statement
            Statement st = conn.createStatement();
            
            String query = "select * from empinfo where uname='"+username+"' and pass='"+password+"' ";
            ResultSet rs = st.executeQuery(query);
            
            if(rs.next())
                f = true;
            
        } catch (Exception e) {
            System.out.println("Error in class Login: "+e);
        }
        
        
        return f;
        
    }
}
