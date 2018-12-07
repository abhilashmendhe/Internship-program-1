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
public class SaleInsertMaker {
    
    public boolean insertSale(String salecode, String itemcode, String itemname, String unit, String price, String date_time, String saleid, String purchaseunit, String amount)
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
            
            String query = "insert into saleinfo values ('"+salecode+"', '"+itemcode+"', '"+itemname+"', '"+unit+"', '"+price+"', '"+date_time+"', '"+saleid+"', '"+purchaseunit+"', '"+amount+"')";
            int x = st.executeUpdate(query);
            if(x>0)
                f = true;
            
        } catch (Exception e) {
            System.out.println("Error in class SaleInsertMaker");
            System.out.println(e);
        }
        
        return f;
    }
}
