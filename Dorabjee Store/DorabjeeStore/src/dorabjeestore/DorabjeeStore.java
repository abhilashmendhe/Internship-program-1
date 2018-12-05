package dorabjeestore;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import AdminOperations.*;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Time;
//import java.awt.Toolkit;

/**
 *
 * @author abhil
 */
public class DorabjeeStore {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        AdminLoginFrame ad = new AdminLoginFrame();
        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
        ad.setVisible(true);
        ad.setSize(d);
        
        
    }
    
}
