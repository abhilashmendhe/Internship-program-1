/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank;

import java.sql.DriverManager;
import java.util.ArrayList;

/**
 *
 * @author abhil
 */
import java.sql.*;
public class FetcherUpdateAccMaker {
    
    public ArrayList fetchupdateacc(String accno)
    {
        ArrayList data = new ArrayList();
        
        try {
            // Driver
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            
            // Connection
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankdb", "root", "root");
            
            // Statement
            Statement st = conn.createStatement();
            
            String query = "select * from accinfo where accno='"+accno+"'";
            ResultSet rs = st.executeQuery(query);
            
            if(rs.next())
            {
                String custname = rs.getString("custname");
                String dob = rs.getString("dob");
                String address = rs.getString("address");
                String email = rs.getString("email");
                String mobile = rs.getString("mobile");
                
                data.add(custname);
                data.add(dob);
                data.add(address);
                data.add(email);
                data.add(mobile);
                
            }    
                
            
            
            
        } catch (Exception e) {
            System.out.println("Error in class FetcherUpdateAccMaker: "+e);
        }
        
        return data;
    }
}
