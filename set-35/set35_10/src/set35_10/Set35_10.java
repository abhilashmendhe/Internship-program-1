/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package set35_10;

/**
 *
 * @author abhil
 */
import java.util.*;
public class Set35_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ArrayList<String> arrlist = new ArrayList<String>();
        
        String s = "Hello World. Hi I am Baymax. I am your personal health care companion.";
        System.out.println(s.length());
        int first = 0;
        int last = 9;
        boolean f = false;
        String sub="";
        for(int i=0; i<s.length(); i++)
        {
            if(last<s.length())
                sub = s.substring(first, last);
            else
            {
                sub = s.substring(first, s.length());
                f = true;
            }
            first = last;
            last = last + 10;
            arrlist.add(sub);
            if(f)
                break;
        }
        
        System.out.println(arrlist);
    }
    
}
