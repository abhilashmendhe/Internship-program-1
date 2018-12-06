/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StockOperations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *
 * @author abhil
 */
public class UpdateStockItemMaker {
    
    public boolean updateStockItem(String newprice, String updatestock, String itemcode)
    {
        boolean f = false;
        
        try {
            // itemc, itemn, unit, price, stock, date_time
            // Driver
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            // Connection
            Connection conn =  DriverManager.getConnection("jdbc:mysql://localhost:3306/rashandb", "root", "root");
            // Statement
            Statement st = conn.createStatement();
            
            String query = "update stockinfo set price='"+newprice+"', stock='"+updatestock+"' where itemc='"+itemcode+"'";
            
            int x = st.executeUpdate(query);
            if(x>0)
                f = true;
            
        } catch (Exception e) {
            System.out.println("Error in class UpdateStockItemMaker");
            System.out.println(e);
        }
        
        return f;
    }
}
