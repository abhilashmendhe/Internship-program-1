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

/**
 *
 * @author abhil
 */
public class FetchItemCodeMaker {
    
    public String fetchIC()
    {
        String ic = "";
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
            
            if(rs.next())
            {
                ic = rs.getString("itemc");
            }
            
            
            
        } catch (Exception e) {
            System.out.println("Error in class FetchItemCodeMaker");
            System.out.println(e);
        }
        
        return ic;
    }
}
