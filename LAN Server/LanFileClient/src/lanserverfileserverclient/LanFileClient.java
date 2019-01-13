/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lanserverfileserverclient;

import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author abhilash
 */
public class LanFileClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LoginFrame l = new LoginFrame();
        l.setVisible(true);
        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
        l.setSize(d);
        
    }
    
}
