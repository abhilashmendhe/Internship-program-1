/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assign6;

/**
 *
 * @author abhilash
 */
public class Three extends Thread{
    
    public void run()
    {
        for(int k=1; k<=10; k++)
        {
//            this.setPriority(2);
            System.out.println("k: "+k);
        }
    }
}
