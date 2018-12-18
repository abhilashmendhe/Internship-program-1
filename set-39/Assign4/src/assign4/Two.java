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
public class Two extends Thread{
    
    public void run()
    {
        for(int j=1; j<=10; j++)
        {
            try {
                if(j==2)
                {
                    System.out.println("j: "+j);
                    Thread.sleep(2000);
                }
            } catch (Exception e) {
            }
        }
    }
}
