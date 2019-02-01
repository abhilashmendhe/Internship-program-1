/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DBops;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *
 * @author abhilash
 */
public class InsertMaker {
    public boolean insert(String ip, String hostname)
    {
        boolean f = false;
        try {
            
            // Driver
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            // Connection
            Connection conn =  DriverManager.getConnection("jdbc:mysql://localhost:3306/npmnode", "myadm", "Myadm@123");
            //Connection conn =  DriverManager.getConnection("jdbc:mysql://localhost:3306/rashandb", "root", "root");
            
            // Statement
            Statement st = conn.createStatement();
            
            String s = "insert into npminfo values ('"+ip+"','"+hostname+"')";
            
            int x = st.executeUpdate(s);
            
            if(x>0)
                f = true;
            
        } catch (Exception e) {
            System.out.println("Error in class InsertMaker: "+e);
        }
        
        return f;
    }
}
