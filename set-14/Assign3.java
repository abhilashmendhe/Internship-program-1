/**
 * @(#)Assign3.java
 *
 *
 * @author
 * @version 1.00 2018/9/3
 */

package set14;
import java.util.*;
public class Assign3 {

    public static void main(String args[])
    {
    	Scanner sc = new Scanner(System.in);
    	System.out.print("Enter n: ");int n = sc.nextInt();

    	int a[] = new int[n];

    	System.out.println("Insert elements in an array");

    	for(int i=0; i<a.length; i++)
    	{
    		a[i] = sc.nextInt();
    	}
    	System.out.println("Elements which are divisible by 9 and not by 6");
    	for(int j=0; j<a.length; j++)
    	{
    		if(a[j]%9==0)
    		{
    			if(a[j]%6!=0)
    			{
    				System.out.print(" "+a[j]);
    			}
    		}
    	}
    }

}