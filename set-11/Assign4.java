/**
 * @(#)Assign4.java
 *
 *
 * @author
 * @version 1.00 2018/8/22
 */

package set11;
public class Assign4 {

    public static void main(String args[])
    {
    	int n=5;
    	for (int i = 1; i<=n; i++)
    	{
    		for(int j=1; j<=i; j++)
    		{
    			System.out.print(" ");
    		}
    		for(int k=1; k<=i; k++)
    		{
    			if(k==1)
    				System.out.print("*");
    		//	else
    		//		System.out.print(" ");
       		}
       		for(int l=n-1; l>=i; l--)
       		{
       			System.out.print(' ');
       		}
       		for(int m=n-1; m>=i-1; m--)
       		{
       			if(m==i)
	       			System.out.print('*');
	       		else
	       			System.out.print(" ");
       		}
       		System.out.println();
    	}
    }
}