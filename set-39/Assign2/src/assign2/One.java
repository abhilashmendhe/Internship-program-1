/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assign2;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author abhilash
 */
public class One extends Thread{
    
    public void run()
    {
        for(int i=1; i<=10; i++)
        {
            try {
                System.out.println("i: "+i);
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(One.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
