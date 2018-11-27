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
public class BankOpsMaker {
    
    public boolean bankamt(String balance, String accno)
    {
        boolean f = false;
        
        try {
            // Driver
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            
            // Connection
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankdb", "root", "root");
            
            // Statement
            Statement st = conn.createStatement();
            
            String query = "update accinfo set openbal='"+balance+"' where accno='"+accno+"'";
            int x = st.executeUpdate(query);
            
            if(x>0)
                f = true;
            
        } catch (Exception e) {
            System.out.println("Error in class DepositMaker: "+e);
        }
        
        return f;
    }
}
