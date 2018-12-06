/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StockOperations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author abhil
 */
public class FetchStockItemMaker {
    
    public ArrayList<String> fetchStockItem(String itemcode)
    {
        ArrayList<String> items = new ArrayList<String>();
        
        try {
            // itemc, itemn, unit, price, stock, date_time
            // Driver
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            // Connection
            Connection conn =  DriverManager.getConnection("jdbc:mysql://localhost:3306/rashandb", "root", "root");
            // Statement
            Statement st = conn.createStatement();
            
            String query = "select * from stockinfo where itemc='"+itemcode+"'";
            ResultSet rs = st.executeQuery(query);
            
            if(rs.next())
            {
                items.add(rs.getString("itemn"));
                items.add(rs.getString("unit"));
                items.add(rs.getString("price"));
                items.add(rs.getString("stock"));
                
            }
            
        } catch (Exception e) {
            System.out.println("Error in class FetchStockItemMaker");
            System.out.println(e);
        }
        
        return items;
    }
}
