/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assign9;

/**
 *
 * @author abhilash
 */
public class Concatenate extends Thread{
    public static String con;
    public void run()
    {
        while(true)
        {
            con += Frame.getst;
            System.out.println(con);
        }
        
        
    }
}
