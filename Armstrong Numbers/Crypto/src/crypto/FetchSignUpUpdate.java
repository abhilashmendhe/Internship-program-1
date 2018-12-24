/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crypto;

/**
 *
 * @author abhil
 */
import java.sql.*;
import java.util.ArrayList;
public class FetchSignUpUpdate {
    
    public ArrayList<String> fetchSignUpData(String username)
    {
        ArrayList<String> data = new ArrayList<String>();
        // name, dob, email, mobile, uname, pass
        
        try {
            // Driver
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            // Connection
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/armstrongdb", "myadm", "Myadm@123");
            //Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/armstrongdb", "root", "root");
            // Statement
            Statement st = conn.createStatement();
            
            String query = "select * from armstrongprofile where uname='"+username+"'";
            ResultSet rs = st.executeQuery(query);
            
            if(rs.next())
            {
                String name = rs.getString("name");
                String dob = rs.getString("dob");
                String email = rs.getString("email");
                String mobile = rs.getString("mobile");
                String pass = rs.getString("pass");
                data.add(name);
                data.add(dob);
                data.add(email);
                data.add(mobile);
                data.add(pass);
            }
            
        } catch (Exception e) {
            System.out.println("Error in class FetchSignUpUpdata: "+e);
        }
        
        return data;
    }
}
