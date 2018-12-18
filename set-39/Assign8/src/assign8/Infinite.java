/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assign8;

/**
 *
 * @author abhilash
 */
public class Infinite extends Thread{

    public void run()
    {
        while(true)
        {
            System.out.println("Hello");
        }
    }
}
