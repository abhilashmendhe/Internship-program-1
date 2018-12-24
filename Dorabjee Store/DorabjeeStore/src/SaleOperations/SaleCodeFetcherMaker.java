/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SaleOperations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

/**
 *
 * @author abhil
 */
public class SaleCodeFetcherMaker {
    
    public HashSet fetchSaleCode()
    {
        HashSet data = new HashSet();
        
        try {
            // salecode, itemcode, itemname, unit, price, date_time, saleid, purchaseunit, amount
            
            // Driver
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            // Connection
            Connection conn =  DriverManager.getConnection("jdbc:mysql://localhost:3306/rashandb", "myadm", "Myadm@123");
            //Connection conn =  DriverManager.getConnection("jdbc:mysql://localhost:3306/rashandb", "root", "root");
            // Statement
            Statement st = conn.createStatement();
            
            String query = "select * from saleinfo";
            ResultSet rs = st.executeQuery(query);
            
            while(rs.next())
            {
                data.add(rs.getString("salecode"));
            }
            
        } catch (Exception e) {
            System.out.println("Error in class SaleCodeFetcherMaker");
            System.out.println(e);
        }
        
        return data;
                
    }
}
