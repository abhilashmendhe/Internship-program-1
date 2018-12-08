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
public class UpdateSaleItemMaker {
    
    public boolean updateSaleItem(String salecode, String itemcode, String punit, String tamt)
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
            
            String query = "update saleinfo set purchaseunit='"+punit+"', amount='"+tamt+"' where salecode='"+salecode+"' and itemcode='"+itemcode+"'";
            int x = st.executeUpdate(query);
            if(x>0)
                f = true;
            
        } catch (Exception e) {
            System.out.println("Error in UpdateSaleItemMaker");
            System.out.println(e);
        }
        
        return f;
    }
}
