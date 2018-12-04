/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.ArrayList;

/**
 *
 * @author abhil
 */
public class BlockMaker {
    
    public ArrayList<String> getBlocks(String st)
    {
        ArrayList<String> block = new ArrayList<String>();
        String tempstring = "";
        
        int x = 12;
        int b = 1;
        try {
            
            if(st.length()<=12)
            {
                tempstring = st.substring(0,st.length());
                for(int i=st.length(); i<12; i++)
                    tempstring += " ";
                
                block.add(tempstring);    
            }
            else
            {
               for(int i=0; i<st.length(); i++)
               {
                    
                    char ch = st.charAt(i);
                    tempstring += ch;
                    if(i+1==x)
                    {
                        block.add(tempstring);
                        b = x;
                        x = x + 12;
                        tempstring = "";
                    }
                    if(i+1==st.length())
                    {
                        tempstring = st.substring(b,(i+1));
                        if(tempstring.length()!=0)
                        {   
                            for(int j=tempstring.length(); j<12; j++)
                                tempstring += " ";
                            
                            block.add(tempstring);
                        }
                    }
                    
               }
            }
            
        } catch (Exception e) {
            System.out.println("Error in class BlockMaker: "+e);
        }
        
        return block;
    }
}
