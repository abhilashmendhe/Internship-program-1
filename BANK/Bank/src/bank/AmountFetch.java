/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank;

import java.util.ArrayList;
import java.sql.*;
/**
 *
 * @author abhil
 */
public class AmountFetch {
    
    public boolean amtaccvalid(String accno)
    {
        boolean f = false;
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
                f = true;
            
        }
        catch(Exception e)
        {
            System.out.println("Error in class DepositFetch");
            System.out.println("Error in function depositvalid: "+e);
        }
            
        return f;
    }
    public ArrayList amountF(String accno)
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
                String openbal = rs.getString("openbal");
                data.add(openbal);
            }
            
        } catch (Exception e) {
            System.out.println("Error in class DepositFetch");
            System.out.println("Error in function deposit: "+e);
        }
        
        
        return data;
    }
}
