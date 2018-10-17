/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package set25_5;

/**
 *
 * @author abhil
 */
public class Unique {
      
    int[] getUniqueArray(int a[])
    {
        int size=0;
        
        for(int i=0; i<a.length; i++)
        {
            int tmp=1;
            boolean f = true;
        
            for(int j=i; j<a.length; j++)
            { 
                if(i!=j)
                {
                //System.out.print(a[i]+" "+a[j]);
                if(a[i]==a[j])
                {
                    f=false;
                    break;
                }   
                }
                   
            }
            //System.out.println();
            if(f)
                size+=tmp;
        }
        
        //System.out.println(size);
        int pos=0;
        int unique[] = new int[size];
        for(int i=0; i<a.length; i++)
        {
            int tmp=1;
            boolean f = true;
        
            for(int j=i; j<a.length; j++)
            { 
                if(i!=j)
                {
                //System.out.print(a[i]+" "+a[j]);
                if(a[i]==a[j])
                {
                    f=false;
                    break;
                }   
                }
                   
            }
            //System.out.println();
            if(f)
                unique[pos++]=a[i];
        }
        
        return unique;
    }
}
