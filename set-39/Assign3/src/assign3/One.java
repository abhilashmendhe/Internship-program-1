/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assign3;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author abhilash
 */
public class One extends Thread {
    
    public void run()
    {
        for(int i=1; i<=10; i++)
        {
            try {
                if(i==3)
                {
                    System.out.println("i: "+i);
                    Thread.sleep(5000);
                }
                else
                    System.out.println("i: "+i);
            
            } catch (InterruptedException ex) {
                Logger.getLogger(One.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }
}
