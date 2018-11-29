/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crypto;

import java.sql.DriverManager;

/**
 *
 * @author abhil
 */
import java.sql.*;
import java.util.ArrayList;
import jdk.nashorn.internal.runtime.arrays.ArrayLikeIterator;
public class LoginMaker {
    
    public ArrayList getLogin()
    {
        // name, dob, email, mobile, uname, pass
        ArrayList<String> data = new ArrayList<String>();
        try {
            // Driver
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            // Connection
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/armstrongdb", "root", "root");
            // Statement
            Statement st = conn.createStatement();
            
            String query = "select * from armstrongprofile";
            ResultSet rs = st.executeQuery(query);
            
            if(rs.next())
            {
                String password = rs.getString("pass");
                String username = rs.getString("uname");
                data.add(username);
                data.add(password);
            }
           
            
        
        } catch (Exception e) {
            System.out.println("Error in class LoginMaker: "+e);
        }
            
        
        return data;
    }
}
