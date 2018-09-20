/**
 * @(#)Assign1.java
 *
 *
 * @author
 * @version 1.00 2018/9/20
 */

package set19;
import java.util.*;
public class Assign1 {

    public static void main(String args[])
    {
    	Scanner sc = new Scanner(System.in);
    	System.out.print("Enter n: ");int n = sc.nextInt();

    	int a[] = new int[n];

    	System.out.println("Enter elements in array");
    	for(int i=0; i<a.length; i++)
    		a[i] = sc.nextInt();

    	System.out.println("Elements of array are");
    	for(int i=0; i<a.length ; i++)
    		System.out.print(" "+a[i]);
    	System.out.println();

    	int sort[] = getArraySort(a);

		System.out.println("Sorted array");
		for(int i=0; i<sort.length; i++)
			System.out.print(" "+sort[i]);
    }

    static int[] getArraySort(int b[])
    {
    	for(int j=0; j<b.length; j++)
    	{
    	for(int i=0; i<b.length; i++)
    	{
    		if(b[j] < b[i])
    		{
    			int tmp = b[j];
    			b[j] = b[i];
    			b[i] = tmp;
    		}
		}
    	}
    	return b;
    }
}