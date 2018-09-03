/**
 * @(#)Assign12.java
 *
 *
 * @author
 * @version 1.00 2018/9/3
 */

package set14;
import java.util.*;
public class Assign12 {

    public static void main(String args[])
    {
    	Scanner sc = new Scanner(System.in);
    	System.out.print("Enter n: ");int n = sc.nextInt();

    	int a[] = new int[n];
    	System.out.println("Enter elements");
    	for(int i=0; i<a.length; i++)
    	{
    		a[i] = sc.nextInt();
    	}

    	System.out.print("Enter element to find: "); int x = sc.nextInt();
    	boolean f = true;
    	int j;
    	for(j=0; j<a.length; j++)
    	{
    		if(a[j]==x)
    		{
    			f = false;
    			break;
    		}
    	}
    	if(f)
    		System.out.println(x+" not found");
    	else
    		System.out.println(x+" found on a["+j+"]");
    }


}