/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DBoperations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author abhilash
 */
public class FetchUserInfoMaker {
    public ArrayList<String> getUserInfo(String uid)
    {
        
        ArrayList<String> datalogin = new ArrayList<String>();
        try {
            
            // Driver
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            
            // Connection
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/lanDB", "myadm", "Myadm@123");
            //Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankdb", "root", "root");
            
            // Statement
            Statement st = conn.createStatement();
            
            String query = "select * from userinfoclient where uid='"+uid+"'";
            
            ResultSet rs = st.executeQuery(query);
            
            if(rs.next())
            {
                datalogin.add(rs.getString("name"));
                datalogin.add(rs.getString("dob"));
                datalogin.add(rs.getString("email"));
                datalogin.add(rs.getString("address"));            
                datalogin.add(rs.getString("uid"));
                datalogin.add(rs.getString("password"));
            }
            
        } catch (Exception e) {
            System.out.println("Error in class FetchUserInfoMaker");
            System.out.println("Error in function getUserInfo: "+e);
        }
        
        return datalogin;
    }
}
