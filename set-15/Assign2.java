/**
 * @(#)Assign2.java
 *
 *
 * @author
 * @version 1.00 2018/9/4
 */

package set15;
import java.util.*;
public class Assign2 {

    public static void main(String args[])
    {
    	Scanner sc = new Scanner(System.in);
    	System.out.print("Enter n: ");int n = sc.nextInt();

		int a[] = new int[n];
    	for(int i=0; i<a.length; i++)
    	{
    		a[i] = sc.nextInt();
    	}

    	for(int j=0; j<a.length-1; j++)
    	{
    		for(int k=0; k<a.length-1; k++)
    		{
    			if(a[k] < a[k+1])
    			{
    				int tmp = a[k];
    				a[k] = a[k+1];
    				a[k+1] = tmp;
    			}
    		}
    	}

    	for(int l=0; l<a.length; l++)
    	{
    		System.out.print(" "+a[l]);
    	}
    }


}