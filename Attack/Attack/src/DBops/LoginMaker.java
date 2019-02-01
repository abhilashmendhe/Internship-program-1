/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DBops;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import sun.awt.OSInfo;

/**
 *
 * @author abhilash
 */
public class LoginMaker {
    
    public ArrayList login(String uname)
    {
        ArrayList a = new ArrayList();
        OSInfo.OSType o = OSInfo.getOSType();
        try {
            // Driver
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            // Connection
            Connection conn = null;
            
            if(o.toString().equals("WINDOWS"))
                conn =  DriverManager.getConnection("jdbc:mysql://localhost:3306/networknode", "root", "root");
            else
                conn =  DriverManager.getConnection("jdbc:mysql://localhost:3306/networknode", "myadm", "Myadm@123");
           
            // Statement
            Statement st = conn.createStatement();
            
            String q = "select * from nodeinfo where uname='"+uname+"'";
            
            ResultSet rs = st.executeQuery(q);
            
            while(rs.next())
            {
                a.add(rs.getString("uname"));
                a.add(rs.getString("pass"));
            }
            
        } catch (Exception e) {
            System.out.println("Error in class LoginMaker: "+e);
            System.out.println(o.equals("WINDOWS"));
        }
        
        return a;
    }
}
