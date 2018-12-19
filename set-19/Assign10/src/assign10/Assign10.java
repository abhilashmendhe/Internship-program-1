/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assign10;

/**
 *
 * @author abhilash
 */
public class Assign10 {

    /**
     * @param args the command line arguments
     */
   
    public static void main(String args[])
    {
        int num = 5;
        int ii = getF(num);
        System.out.println(ii);
    }
    
    public static int getF(int num)
    {
        int fib = 0;
        if(num==1)
            return 0;
        else if(num==2)
            return 1;
        
        else
        {
            return (getF(num-1)+getF(num-2));
            
        }
  
    }
    
}
