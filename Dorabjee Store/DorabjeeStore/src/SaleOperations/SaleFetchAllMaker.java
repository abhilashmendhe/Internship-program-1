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

/**
 *
 * @author abhil
 */
public class SaleFetchAllMaker {
    
    public ArrayList fetchAllSale(String salecode)
    {
        ArrayList saleinfo = new ArrayList();
        
        try {
            // salecode, itemcode, itemname, unit, price, date_time, saleid, purchaseunit, amount
            
            // Driver
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            // Connection
            Connection conn =  DriverManager.getConnection("jdbc:mysql://localhost:3306/rashandb", "myadm", "Myadm@123");
            //Connection conn =  DriverManager.getConnection("jdbc:mysql://localhost:3306/rashandb", "root", "root");
            // Statement
            Statement st = conn.createStatement();
            
            String query = "select * from saleinfo where salecode='"+salecode+"'";
            ResultSet rs = st.executeQuery(query);
            
            while(rs.next())
            {
                ArrayList<String> tempsale = new ArrayList<String>();
                tempsale.add(rs.getString("salecode"));
                tempsale.add(rs.getString("itemcode"));
                tempsale.add(rs.getString("itemname"));
                tempsale.add(rs.getString("unit"));
                tempsale.add(rs.getString("price"));
                tempsale.add(rs.getString("date_time"));
                tempsale.add(rs.getString("saleid"));
                tempsale.add(rs.getString("purchaseunit"));
                tempsale.add(rs.getString("amount"));
                
                saleinfo.add(tempsale);
            }
            
        } catch (Exception e) {
            System.out.println("Error in class SaleFetchAllMaker");
            System.out.println(e);
        }
        
        return saleinfo;
    }
}
