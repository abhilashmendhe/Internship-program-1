/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DOSNetworkOps;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author abhilash
 */
public class InsertMaker {
    
    public boolean insertOps(String servername, String filesSize, String date_time) throws SQLException
    {
        
        boolean f = false;
        try {
            
            
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            
            // Connection
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sdnDB", "root", "Asimov@1234");
            //Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankdb", "root", "root");
            
            // Statement
            Statement st = conn.createStatement();
            
            String q = "insert into dosattack values('"+servername+"', '"+filesSize+"', '"+date_time+"')";
            
            int x=st.executeUpdate(q);
            
            if(x>0)
                f = true;
            
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(InsertMaker.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(InsertMaker.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(InsertMaker.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(f);
        return f;
    }
    
}
