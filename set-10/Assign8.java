/**
 * @(#)Assign8.java
 *
 *
 * @author
 * @version 1.00 2018/8/22
 */

package set10;
public class Assign8 {

    public static void main(String args[])
    {
    	int t = 0;

    	for(int i=1; i<=5; i++)
    	{
    		for(int j=1; j<=i; j++)
    		{
    			System.out.print(" ");
    		}
    		for(int k=5; k>=i; k--)
    		{   //if(k==1)
    			//break;
    			//else
    			System.out.print(k-t);
    		}

    		t += 1;

    		for(int l=4; l>=i; l--)
    		{
    			System.out.print(6-l);
    		}

    		System.out.println();
    	}
    }

}