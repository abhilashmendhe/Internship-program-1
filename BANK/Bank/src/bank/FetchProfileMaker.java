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
public class FetchProfileMaker {
    
    public ArrayList fetchprofile(String username)
    {
        ArrayList<String> data = new ArrayList<String>();
        
        try {
            // Driver
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            // Connection
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankdb", "root", "root");
            // Statement
            Statement st = conn.createStatement();
            
            String query = "select * from empinfo where uname='"+username+"'";
            ResultSet rs = st.executeQuery(query);
            
            if(rs.next())
            {
              String fname = rs.getString("name");
              String dob = rs.getString("dob");
              String email = rs.getString("email");
              String address = rs.getString("address");
              String uname = rs.getString("uname");
              String password = rs.getString("pass");
              data.add(fname);
              data.add(dob);
              data.add(email);
              data.add(address);
              data.add(uname);
              data.add(password);
            }
            
        } catch (Exception e) {
        
            System.out.println("Error in class FetchProfileMaker: "+e);
        }
        
        
        return data;
    }
}
