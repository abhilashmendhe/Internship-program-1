/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DBoperations;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author abhilash
 */
public class FetchFileInfo {
    
    public ArrayList fetchFilein()
    {
        
        ArrayList all = new ArrayList();
        try {
            
        
        // Driver
        Class.forName("com.mysql.jdbc.Driver").newInstance();
            
        // Connection
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/lanDB", "myadm", "Myadm@123");
        //Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankdb", "root", "root");
            
        // Statement
        Statement st = conn.createStatement();
        
        String q = "select * from fileinfo";
        ResultSet rs = st.executeQuery(q);
        while(rs.next())
        {
            ArrayList data = new ArrayList();
            data.add(rs.getString("uid"));
            data.add(rs.getString("date_time"));
            data.add(rs.getString("filename"));
            
            all.add(data);
        }
            
        } catch (Exception e) {
            System.out.println("Error in FetchFileInfo: "+e);
        }
        return all;
    }       
}
