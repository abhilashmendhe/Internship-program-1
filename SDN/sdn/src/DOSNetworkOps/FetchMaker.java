/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DOSNetworkOps;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author abhilash
 */
public class FetchMaker {
 
    public String fetch()
    {
        String f = "";
        
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            
            // Connection
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sdnDB", "root", "Asimov@1234");
            //Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankdb", "root", "root");
            
            // Statement
            Statement st = conn.createStatement();
            
            String q= "select * from dosattack";
            
            ResultSet rs = st.executeQuery(q);
            
            if(rs.next())
            {
                f = rs.getString("filessize");
            }
            
        } catch (Exception e) {
        }
        
        return f;
    }
}
