/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AdminOperations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author abhil
 */
public class FetchAllStaff {
    
    public ArrayList getAllStaff()
    {
        ArrayList allstaff = new ArrayList();
        
        try {
            // fname, dob, age, caddr, paddr, mobile, email, uname, pass
            
            // Driver
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            // Connection
            Connection conn =  DriverManager.getConnection("jdbc:mysql://localhost:3306/rashandb", "root", "root");
            // Statement
            Statement st = conn.createStatement();
            
            String query = "select * from staffinfo";
            ResultSet rs = st.executeQuery(query);
            
            while(rs.next())
            {
                ArrayList<String> in = new ArrayList<String>();
                String fname = rs.getString("fname");
                String dob = rs.getString("dob");
                String age = rs.getString("age");
                String caddr = rs.getString("caddr");
                String paddr = rs.getString("paddr");
                String mobile = rs.getString("mobile");
                String email = rs.getString("email");
                String uname = rs.getString("uname");
                String pass = rs.getString("pass");
                
                
                in.add(fname);
                in.add(dob);
                in.add(age);
                in.add(caddr);
                in.add(paddr);
                in.add(mobile);
                in.add(email);
                in.add(uname);
                in.add(pass);
                
                allstaff.add(in);
            }
            
        } catch (Exception e) {
            System.out.println("Error in class FetchAllStaff");
            System.out.println(e);
        }
        
        return allstaff;
    }
}
