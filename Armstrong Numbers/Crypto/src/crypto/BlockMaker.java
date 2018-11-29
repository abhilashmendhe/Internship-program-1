/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crypto;

import java.util.ArrayList;

/**
 *
 * @author abhil
 */
public class BlockMaker {
    
    public ArrayList<String> getBlocks(String st)
    {
        ArrayList<String> block = new ArrayList<String>();
        
        System.out.println(st.length());
        int y = 0;
        int x = 12;
        String tempst = "";
        
        for(int i=0; i<st.length(); i++)
        {
            boolean f = false;
            tempst = st.substring(y, x);
            
            y = x;
            x = y+12;
           
           block.add(tempst);
           
           if(x>st.length())
           {
               tempst = st.substring(y,st.length());
               tempst = tempst+"          ";
               f = true;
           }
           if(f)
           {
                block.add(tempst);
                break;
           }
        }
        return block;
    }
}
