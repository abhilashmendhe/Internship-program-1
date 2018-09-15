/**
 * @(#)Fifteen.java
 *
 *
 * @author
 * @version 1.00 2018/9/15
 */

package set18;
import java.util.*;
public class Fifteen {

    public static void main(String args[])
    {
    	Scanner sc = new Scanner(System.in);
    	System.out.print("Enter array size: ");int n = sc.nextInt();

    	int a[] = new int[n+1];

    	System.out.println("Enter elements in array");
 		for(int i=0; i<n; i++)
 			a[i] = sc.nextInt();

		System.out.println("Elements of array before insertion of an element");
		for(int i=0; i<n; i++)
			System.out.print(" "+a[i]);

 		InsertElement(a);
    }

    static void InsertElement(int b[])
    {
   		Scanner sc = new Scanner(System.in);
    	System.out.print("\n\nEnter element to insert: ");int element = sc.nextInt();
    	System.out.print("\nEnter the position to insert element: ");int pos = sc.nextInt()-1;


    	for(int i=b.length-1; i>pos; i--)
    	{
    		b[i] = b[i-1];
    	}
    	b[pos] = element;

    	System.out.println("Elements of array after insertion of an element");
		for(int i=0; i<b.length; i++)
			System.out.print(" "+b[i]);
    }

}