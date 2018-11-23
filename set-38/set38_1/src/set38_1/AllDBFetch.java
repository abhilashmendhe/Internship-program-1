/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package set38_1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author abhil
 */
public class AllDBFetch {
    
    
    public ArrayList allFetch()
    {
        ArrayList data = new ArrayList();
        
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentinfo","root","root");
            Statement st = conn.createStatement();
            
            String q = "select * from student";
            ResultSet rs = st.executeQuery(q);
            
            while(rs.next())
            {
                ArrayList arr = new ArrayList();
                String rn = rs.getString("Roll_no");
                String name = rs.getString("name");
                String per = rs.getString("percentage");
                arr.add(rn);
                arr.add(name);
                arr.add(per);
                data.add(arr);
                
            }
            
        } catch (Exception e) {
            System.out.println("Error in class fetchDB "+e);
        }
        
        return data;
    }
}
