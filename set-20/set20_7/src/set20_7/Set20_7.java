/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package set20_7;

import com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type;

/**
 *
 * @author abhi
 */
public class Set20_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String str = "@#shrepad?//";
        
        String an="";
        System.out.println("After removing special characters: "+str);
        for(int i=0; i<str.length(); i++)
        {
           // an = "";
            char ch = str.charAt(i);
            int ascii = (int) ch;
            if((ascii >= 33 && ascii <=47) || (ascii >= 58 && ascii <= 64) || (ascii >= 91 && ascii <= 96) || (ascii >=123 && ascii <= 126))
            {
                str = str.replace(ch,' ');
            }
            an = str;
            an = an.replace(" ","");
        }
        System.out.println("After removing special characters: "+an);
        
    }
    
}
