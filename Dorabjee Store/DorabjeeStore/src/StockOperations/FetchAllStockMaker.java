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
public class FetchAllStockMaker {
    
    public ArrayList fetchallstock()
    {
        ArrayList stock = new ArrayList();
        
        try {
            // itemc, itemn, unit, price, stock, date_time
            // Driver
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            // Connection
            Connection conn =  DriverManager.getConnection("jdbc:mysql://localhost:3306/rashandb", "root", "root");
            // Statement
            Statement st = conn.createStatement();
            
            String query = "select * from stockinfo";
            ResultSet rs = st.executeQuery(query);
            
            while(rs.next())
            {
                ArrayList<String> data = new ArrayList<String>();
                data.add(rs.getString("itemc"));
                data.add(rs.getString("itemn"));
                data.add(rs.getString("unit"));
                data.add(rs.getString("price"));
                data.add(rs.getString("stock"));
                data.add(rs.getString("date_time"));
                
                stock.add(data);
                
            }
            
            
        } catch (Exception e) {
            System.out.println("Error in class FetchAllStockMaker");
            System.out.println(e);
        }
        
        return stock;
    }
}
