/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StaffOperations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author abhil
 */
public class StaffLoginValidMaker {
     public ArrayList getLogin()
    {
        ArrayList creds = new ArrayList();
        
        try {
            // fname, dob, age, caddr, paddr, mobile, email, uname, pass
            // Driver
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            // Connection
            Connection conn =  DriverManager.getConnection("jdbc:mysql://localhost:3306/rashandb", "root", "root");
            // Statement
            Statement st = conn.createStatement();
            
            String query = "select * from staffinfo";
            ResultSet rs = st.executeQuery(query);
            
            while(rs.next())
            {
                ArrayList<String> temp = new ArrayList<String>();
                String uname = rs.getString("uname");
                String pass = rs.getString("pass");
                temp.add(uname);
                temp.add(pass);
                creds.add(temp);
            }
            
        } catch (Exception e) {
            System.out.println("Error in class StaffLoginValidMaker");
            System.out.println(e);
        }
        
        return creds;
    }
}
