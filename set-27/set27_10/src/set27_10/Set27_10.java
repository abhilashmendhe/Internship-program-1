/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package set27_10;

/**
 *
 * @author abhil
 */
import matrixops2.*;
public class Set27_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Principal p = new Principal();
        int m[][] = {{1,2,3},{4,5,6},{7,8,9}};
        int mabove[] = p.getAbove(m);
        int mbelove[] = p.getBelow(m);
        
        System.out.println("Elements above principal diagonal are");
        for(int i=0; i<mabove.length; i++)
            System.out.print(" "+mabove[i]);
        
        System.out.println();
        
        System.out.println("Elements below principal diagonal are");
        for(int i=0; i<mbelove.length; i++)
            System.out.print(" "+mbelove[i]);
        
        System.out.println();
        
        Secondry s = new  Secondry();
        int sabove[] = s.getAbove(m);
        int sbelow[] = s.getBelow(m);
        
        System.out.println("Elements above secondary diagonal are");
        for(int i=0; i<sabove.length; i++)
            System.out.print(" "+sabove[i]);
        
        System.out.println();
        
        System.out.println("Elements below secondary diagonal are");
        for(int i=0; i<sbelow.length; i++)
            System.out.print(" "+sbelow[i]);
        
        System.out.println();
        
    }
    
}
