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
    
    public boolean updateaccvalid(String accno)
    {
        boolean f = false;
        
        try {
            // Driver
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            
            // Connection
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankdb", "root", "Asimov@1234");
            
            // Statement
            Statement st = conn.createStatement();
            
            String query = "select accno from accinfo where accno='"+accno+"'";
            ResultSet rs = st.executeQuery(query);
            if(rs.next())
                f = true;
            
        } catch (Exception e) {
            System.out.println("Error in class FetcherUpdateAccMaker");
            System.out.println("Error in function updateaccvalid: "+e);
        }
        
        return f;
    }
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
                String bal = rs.getString("openbal");
                
                data.add(custname);
                data.add(dob);
                data.add(address);
                data.add(email);
                data.add(mobile);
                data.add(bal);
                
            }    
                
            
            
            
        } catch (Exception e) {
            System.out.println("Error in class FetcherUpdateAccMaker");
            System.out.println("Error in function fetchupdateacc: "+e);
        }
        
        return data;
    }
}
