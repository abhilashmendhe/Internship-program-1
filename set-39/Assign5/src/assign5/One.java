/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assign5;

/**
 *
 * @author abhilash
 */
public class One extends Thread{

    public void run()
    {
        for(int i=1; i<=50; i++)
        {
            System.out.println("i: "+i);
            if(i==4)
            {
                //System.out.println("i: "+i);
                this.yield();
            }
            if(i==23)
            {
              //  System.out.println("i: "+i);
                this.yield();
            }
            if(i==40)
            {
                //System.out.println("i: "+i);
                this.yield();
            }
        }
    }
}
