/**
 * @(#)Thirteen.java
 *
 *
 * @author
 * @version 1.00 2018/9/15
 */

package set18;
import java.util.*;
public class Thirteen {

    public static void main(String args[])
    {
    	Scanner sc = new Scanner(System.in);
    	System.out.print("Enter array size: ");int n = sc.nextInt();
    	int a[] = new int[n];

    	System.out.println("Enter elements in an array: ");
    	for(int i=0; i<a.length; i++)
    		a[i] = sc.nextInt();

    	int big = getBiggest(a);
    	int small = getSmallest(a);

    	int sum = big + small;

    	System.out.println("Sum of biggest and smallest element is "+sum);
    }

    static int getBiggest(int b[])
    {
    	int big = b[0];
    	for(int i=0; i<b.length; i++)
    	{
    		if(big < b[i])
    			big = b[i];
    	}

    	return big;
    }

	static int getSmallest(int b[])
    {
    	int small = b[0];
    	for(int i=0; i<b.length; i++)
    	{
    		if(small > b[i])
    			small = b[i];
    	}

    	return small;
    }
}