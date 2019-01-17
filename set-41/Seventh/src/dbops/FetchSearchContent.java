/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbops;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author abhilash
 */
public class FetchSearchContent {
    public ArrayList fetchContent()
    {
        ArrayList getall = new ArrayList();
        
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            
            // Connection
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/searchEngineDB", "myadm", "Myadm@123");
            //Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankdb", "root", "root");
            
            // Statement
            Statement st = conn.createStatement();
            
            String q = "select * from searchcontent";
            
            ResultSet rs = st.executeQuery(q);
            
            while(rs.next())
            {
                ArrayList<String> get = new ArrayList<String>();
                get.add(rs.getString("url"));
                get.add(rs.getString("content"));
                getall.add(get);
            }
            
        } catch (Exception e) {
            System.out.println("Error in class FetchSearchContent: "+e);
        }
        
        return getall;
               
    }
}
