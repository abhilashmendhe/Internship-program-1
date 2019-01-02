/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cancer;

import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author abhilash
 */
public class Cancer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MainFrm m = new MainFrm();
        m.setVisible(true);
        Dimension d  = Toolkit.getDefaultToolkit().getScreenSize();
        m.setSize(d);
    }
    
}
