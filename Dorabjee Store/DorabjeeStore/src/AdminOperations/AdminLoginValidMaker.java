/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AdminOperations;

import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author abhil
 */
public class AdminLoginValidMaker {
    
    public ArrayList<String> getLogin()
    {
        ArrayList<String> creds = new ArrayList<String>();
        
        try {
            // Driver
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            // Connection
            Connection conn =  DriverManager.getConnection("jdbc:mysql://localhost:3306/rashandb", "myadm", "Myadm@123");
            //Connection conn =  DriverManager.getConnection("jdbc:mysql://localhost:3306/rashandb", "root", "root");
            
            // Statement
            Statement st = conn.createStatement();
            
            String query = "select * from admininfo";
            ResultSet rs = st.executeQuery(query);
            
            if(rs.next())
            {
                String uname = rs.getString("uname");
                String pass = rs.getString("pass");
                creds.add(uname);
                creds.add(pass);
            }
            
        } catch (Exception e) {
            System.out.println("Error in class AdminLoginValidMaker");
            System.out.println(e);
        }
        
        return creds;
    }
}
