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
    public static void main(String[] args) {
        // TODO code application logic here
        int n = 5;
    }
    public static int getFib(int n)
    {
        int n1 = 0, n2 = 1;
        if(n==0)
            return 0;
        else
        {
            return n1 + getFib(n-1);
        }
        
    }
    
}
