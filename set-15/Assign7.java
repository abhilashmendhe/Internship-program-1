/**
 * @(#)Assign7.java
 *
 *
 * @author
 * @version 1.00 2018/9/5
 */

package set15;
import java.util.*;
public class Assign7 {

    public static void main(String args[])
    {
    	Scanner sc = new Scanner(System.in);
    	System.out.print("Enter size of array n: ");int n = sc.nextInt();
    	int a[] = new int[n+1];

		System.out.println("\nInsert elements");
    	for(int i=0; i<n; i++)
    	{
    		a[i] = sc.nextInt();
    	}

    	System.out.println("Before insertion array is");
    	for(int i=0; i<n ; i++)
    	{
    		System.out.print(" "+a[i]);
    	}

    	System.out.print("\nEnter pos to insert element: "); int pos = sc.nextInt();
    	System.out.print("\nEnter element to insert: "); int num = sc.nextInt();

    	System.out.println("\nNow after insertion into array");


    	for(int j=n; j>pos-1; j--)
    	{
    		a[j] = a[j-1];
    	}
		a[pos-1] = num;
    	for(int k=0; k<a.length; k++)
    	{
  		System.out.print(" "+a[k]);
  		}
    }


}