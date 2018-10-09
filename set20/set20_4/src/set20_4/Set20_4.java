/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package set20_4;

/**
 *
 * @author abhi
 */
public class Set20_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

    String st = "InDia";
    int uc=0;
    int lc=0;
    
    for(int i=0; i<st.length(); i++)
    {
        char ch =  st.charAt(i);
        int a = (int) ch;
        
        if(a>=65 && a<=90)
            uc++;
        else if(a>=97 && a<=122)
            lc++;
    }
    System.out.println("Number of upper char are "+uc);
    System.out.println("Number of lower char are "+lc);
    }
    
}
