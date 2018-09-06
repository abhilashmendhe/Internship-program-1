/**
 * @(#)Assign8.java
 *
 *
 * @author
 * @version 1.00 2018/9/5
 */

package set15;
import java.util.*;
public class Assign8 {

    public static void main(String args[])
    {
    	Scanner sc = new Scanner(System.in);
    	System.out.print("Enter size of array: ");int n = sc.nextInt();
    	int a[] = new int[n];

    	System.out.println("Insert Elements");

    	for(int i=0; i<a.length; i++)
    		a[i] = sc.nextInt();

    	System.out.print("Enter element to remove "); int elem = sc.nextInt();
    	int pos=-1;
    	for(int i=0; i<a.length; i++)
    	{
    		if(elem==a[i])
    			pos=i;
    //		else
    //			System.out.print(" "+a[i]);
    	}
    	for(int j=pos; j<a.length-1; j++)
    		a[j] = a[j+1];

    	for(int k=0; k<a.length-1; k++)
    		System.out.print(" "+a[k]);

    	System.out.println(pos);
    }

}