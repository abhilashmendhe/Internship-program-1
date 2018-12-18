/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assign4;

/**
 *
 * @author abhilash
 */
public class One extends Thread{
    
    public void run()
    {
        try {
            for(int i=1; i<=10; i++)
            {
                if(i==4)
                {
                    System.out.println("i: "+i);
                    new One().stop();
                }
                  
            }
        } catch (Exception e) {
        }
    }
}
