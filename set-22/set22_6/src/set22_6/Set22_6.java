/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package set22_6;

/**
 *
 * @author abhil
 */
public class Set22_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x[] = {5,0,-3,2,1};
        int y[] = {4,4,4,4,4};
        
        Parallel p1[] = new Parallel[5];
        
        for(int i=0; i<5; i++)
        {
            p1[i] = new Parallel();
            p1[i].getData(x[i],y[i]);
        }
        
        boolean f = p1[0].getParallel(p1);
        
        if(f)
            System.out.println("Parallel");
        else
            System.out.println("Not Parralel");
        
    }
    
}
