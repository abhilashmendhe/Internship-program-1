/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package set38_1;

import java.util.ArrayList;

/**
 *
 * @author abhil
 */
import java.sql.*;

public class DBFetch {
    
    public ArrayList fetchDB(String roll)
    {
        ArrayList data = new ArrayList();
        
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentinfo","root","root");
            Statement st = conn.createStatement();
            
            String q = "select name, percentage from student where roll_no='"+roll+"'";
            ResultSet rs = st.executeQuery(q);
            
            if(rs.next())
            {
                String name = rs.getString("name");
                String per = rs.getString("percentage");
                data.add(name);
                data.add(per);
            }
            
        } catch (Exception e) {
            System.out.println("Error in class fetchDB "+e);
        }
        
        return data;
    }
}
