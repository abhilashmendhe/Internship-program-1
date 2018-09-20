/**
 * @(#)Assign2.java
 *
 *
 * @author
 * @version 1.00 2018/9/20
 */

package set19;
import java.util.*;
public class Assign2 {

    public static void main(String args[])
    {
    	Scanner sc = new Scanner(System.in);
    	System.out.print("Enter n: ");int n = sc.nextInt();

    	int a[] = new int[n];

    	System.out.println("Enter elements in an array");
    	for(int i=0; i<a.length; i++)
    		a[i] = sc.nextInt();

    	System.out.println("Elements of array are");
    	for(int i=0; i<a.length; i++)
    		System.out.print(" "+a[i]);

    	System.out.println();

		int even_array[] = getEvenArray(a);

		System.out.println("Even array");
		for(int i=0; i<even_array.length; i++)
			System.out.print(" "+even_array[i]);
		System.out.println();
	}

	static int[] getEvenArray(int b[])
	{
		int count = 0;

		for(int i=0; i<b.length; i++)
		{
			if(b[i]%2==0)
				count++;
		}

		int even[] = new int[count];
		int j=0;
		for(int i=0; i<b.length; i++)
		{
			if(b[i]%2==0)
			{
				even[j] = b[i];
			      j++;
			}
		}
		return even;
	}
}