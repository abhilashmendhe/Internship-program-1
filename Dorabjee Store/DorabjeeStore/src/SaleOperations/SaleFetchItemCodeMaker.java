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
import javax.naming.spi.DirStateFactory;

/**
 *
 * @author abhil
 */
public class SaleFetchItemCodeMaker {
    
    public ArrayList fetchItemCode(String itemcode, String salecode)
    {
        ArrayList data = new ArrayList();
        
        try {
            // salecode, itemcode, itemname, unit, price, date_time, saleid, purchaseunit, amount
            
            // Driver
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            // Connection
            Connection conn =  DriverManager.getConnection("jdbc:mysql://localhost:3306/rashandb", "myadm", "Myadm@123");
            //Connection conn =  DriverManager.getConnection("jdbc:mysql://localhost:3306/rashandb", "root", "root");
            // Statement
            Statement st = conn.createStatement();
            
            String query = "select * from saleinfo where salecode='"+salecode+"' and itemcode='"+itemcode+"'";
            ResultSet rs = st.executeQuery(query);
            
            if(rs.next())
            {
                
                data.add(rs.getString("itemname"));
                data.add(rs.getString("unit"));
                data.add(rs.getString("price"));
                data.add(rs.getString("date_time"));
                data.add(rs.getString("purchaseunit"));
                data.add(rs.getString("amount"));
                
                
                  
            }
            
        } catch (Exception e) {
            System.out.println("Error in class SaleFetchItemCodeMaker");
            System.out.println(e);
        }
        
        return data;
    }
}
