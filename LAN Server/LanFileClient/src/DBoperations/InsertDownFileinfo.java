/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DBoperations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *
 * @author abhilash
 */
public class InsertDownFileinfo {
    public boolean insertinto(String uid, String date_time, String keyword, String filename)
    {
        boolean f = false;
        
        try {
            
            // Driver
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            
            // Connection
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/lanDB", "myadm", "Myadm@123");
            //Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankdb", "root", "root");
            
            // Statement
            Statement st = conn.createStatement();
            
            String q = "insert into downfileinfo values('"+uid+"','"+date_time+"','"+keyword+"','"+filename+"')";
            
            int x = st.executeUpdate(q);
            
            if(x>0)
                f = true;
            
            
        } catch (Exception e) {
            System.out.println("Error in InsertDownFileinfo: "+e);
        }
        
        return f;
    }
}
