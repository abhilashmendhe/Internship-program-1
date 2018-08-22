/**
 * @(#)Assign4.java
 *
 *
 * @author
 * @version 1.00 2018/8/20
 */

package set9;
public class Assign4 {

    public static void main(String args[])
    {
/*		int n=5;
    	for (int i=1; i<=5; i++)
    	{
    		int blank = n - i;
    		for(int j=1; j<=blank; j++)
    		{
    		System.out.print(" ");
    		}
    		for(int k=1; k<=i;k++){

		System.out.print("*");
    		}
		System.out.println();
    	}*/
    	for(int i=1; i<=5; i++)
    	{
    		for(int j=5; j>=i; j--)
    		{
    			System.out.print(" ");
    		}
    		for(int k=1; k<=i; k++)
    		{
    			System.out.print("*");
    		}
    		System.out.println();
    	}
    }


}