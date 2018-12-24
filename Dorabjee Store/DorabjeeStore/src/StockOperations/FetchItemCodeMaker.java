/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StockOperations;

import java.sql.Array;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author abhil
 */
public class FetchItemCodeMaker {
    
    public ArrayList fetchIC()
    {
        ArrayList data = new ArrayList();
        try {
            // itemc, itemn, unit, price, stock, date_time
            // Driver
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            // Connection
            Connection conn =  DriverManager.getConnection("jdbc:mysql://localhost:3306/rashandb", "myadm", "Myadm@123");
            //Connection conn =  DriverManager.getConnection("jdbc:mysql://localhost:3306/rashandb", "root", "root");
            // Statement
            Statement st = conn.createStatement();
            
            String query = "select * from stockinfo";
            ResultSet rs = st.executeQuery(query);
            
            while(rs.next())
            {
                ArrayList<String> arr = new ArrayList<String>();
                String ic = rs.getString("itemc");
                arr.add(ic);
                data.add(arr);
            }
            
            
            
        } catch (Exception e) {
            System.out.println("Error in class FetchItemCodeMaker");
            System.out.println(e);
        }
        
        return data;
    }
}
