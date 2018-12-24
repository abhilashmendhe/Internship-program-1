/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AdminOperations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *
 * @author abhil
 */
public class CreateStaffMaker {
    
    public boolean createStaffAcc(String fullname, String dob, String age, String caddr, String paddr, String mobile, String email, String uname, String pass)
    {
        boolean f = false;
        
        try {
            // fname, dob, age, caddr, paddr, mobile, email, uname, pass
            
            // Driver
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            // Connection
            Connection conn =  DriverManager.getConnection("jdbc:mysql://localhost:3306/rashandb", "myadm", "Myadm@123");
            //Connection conn =  DriverManager.getConnection("jdbc:mysql://localhost:3306/rashandb", "root", "root");
            // Statement
            Statement st = conn.createStatement();
            
            String query = "insert into staffinfo values ('"+fullname+"', '"+dob+"', '"+age+"', '"+caddr+"', '"+paddr+"', '"+mobile+"', '"+email+"', '"+uname+"', '"+pass+"')";
        
            int x = st.executeUpdate(query);
            if(x>0)
                f = true;
            
        } catch (Exception e) {
            System.out.println("Error in class CreateStaffMaker");
            System.out.println(e);
        }
        
        return f;
    }
}
