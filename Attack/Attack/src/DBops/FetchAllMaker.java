/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DBops;

import com.mysql.cj.protocol.Resultset;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author abhilash
 */
public class FetchAllMaker {
    
    public ArrayList fetch(String uname)
    {
        ArrayList all = new ArrayList();
        
        try {
            // Driver
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            // Connection
            Connection conn =  DriverManager.getConnection("jdbc:mysql://localhost:3306/networknode", "myadm", "Myadm@123");
            //Connection conn =  DriverManager.getConnection("jdbc:mysql://localhost:3306/rashandb", "root", "root");
            
            // Statement
            Statement st = conn.createStatement();
            
            String q = "Select * from nodeinfo where uname='"+uname+"'";
            
            ResultSet rs = st.executeQuery(q);
            
            if(rs.next())
            {
                all.add(rs.getString("name"));
                all.add(rs.getString("email"));
                all.add(rs.getString("mobile"));
                all.add(rs.getString("pass"));
            }
            
            
            
        } catch (Exception e) {
            System.out.println("Error in class FetchAllMaker: "+e);
        }
        
        return all;
    }
}
