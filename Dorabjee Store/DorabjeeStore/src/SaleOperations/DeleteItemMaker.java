/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SaleOperations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *
 * @author abhil
 */
public class DeleteItemMaker {
    
    public boolean deleteItem(String itemcode)
    {
        boolean f = false;
        
        try {
            
            // salecode, itemcode, itemname, unit, price, date_time, saleid, purchaseunit, amount
            // Driver
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            // Connection
            Connection conn =  DriverManager.getConnection("jdbc:mysql://localhost:3306/rashandb", "root", "root");
            // Statement
            Statement st = conn.createStatement();
            
            String query = "delete from saleinfo where itemcode='"+itemcode+"'";
            int x = st.executeUpdate(query);
            if(x>0)
                f = false;
            
        } catch (Exception e) {
            System.out.println("Error in class DeleteItemMaker");
            System.out.println(e);
        }
        
        return f;
    }
}
