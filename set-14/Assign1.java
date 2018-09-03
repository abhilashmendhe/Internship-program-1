/**
 * @(#)Assign1.java
 *
 *
 * @author
 * @version 1.00 2018/9/3
 */

package set14;
import java.util.*;
public class Assign1 {

    public static void main(String args[])
    {
    	Scanner sc = new Scanner(System.in);
    	System.out.print("Enter n: ");int n = sc.nextInt();

    	int a[] = new int[n];

    	System.out.println("Add numbers in arrays");

    	for(int i=0; i<a.length; i++)
    	{
    		a[i] = sc.nextInt();
    	}

		System.out.println("Elements are");
    	for(int j=0; j<a.length; j++)
    	{
    		System.out.print(" "+a[j]);
    	}
    }

}