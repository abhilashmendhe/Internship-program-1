/**
 * @(#)Assign8.java
 *
 *
 * @author
 * @version 1.00 2018/8/23
 */

package set11;
public class Assign8 {

    public static void main(String args[])
    {
    	for(int i=5; i>=1; i--)
    	{
    		int z=i;
    		for(int j=1; j<=i-1; j++)
    		{
    			System.out.print(" ");
    		}

    		for(int k=5; k>=i; k--)
    		{
    			System.out.print(z++);
    		}
    		if(i!=5){
    		for(int l=5; l>=i+1; l--)
    		{
    			System.out.print((--z)-1);
    		}
    		}
    		System.out.println();
    	}
    }


}