/**
 * @(#)Assign13.java
 *
 *
 * @author
 * @version 1.00 2018/9/7
 */

package set15;
import java.util.*;
public class Assign13 {

    public static void main(String args[])
    {
    	Scanner sc = new Scanner(System.in);
    	System.out.print("Enter size of first array: ");int n1=sc.nextInt();
    	int a[] = new int[n1];
    	System.out.println("Insert element in first array");
    	for(int i=0; i<a.length; i++)
    	{
    		a[i] = sc.nextInt();
    	}

    	System.out.print("Enter size of second array: ");int n2=sc.nextInt();
    	int b[] = new int[n2];
    	System.out.println("Insert element in second array");
    	for(int i=0; i<b.length; i++)
    	{
    		b[i] = sc.nextInt();
    	}

    	for(int i=0; i<a.length; i++)
    	{
    		for(int j=0; j<b.length; j++)
    		{
    			if(a[i]==b[j])
    			{
					System.out.println("Common elements are "+a[i]);
    			}
    		}
    	}
	 }

}