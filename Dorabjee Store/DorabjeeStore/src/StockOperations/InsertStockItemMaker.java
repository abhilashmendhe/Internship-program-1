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
public class InsertStockItemMaker {
    
    public boolean insertStock(String itemcode, String itemname, String unit, String price, String stock, String date_time)
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
            
            String query = "insert into stockinfo values ('"+itemcode+"' ,'"+itemname+"' ,'"+unit+"' ,'"+price+"' ,'"+stock+"' ,'"+date_time+"')";
            int x = st.executeUpdate(query);
            if(x>0)
                f = true;
            
        } catch (Exception e) {
            System.out.println("Error in InsertStockItemMaker");
            System.out.println(e);
        }
          
        
        return f;
    }
}
