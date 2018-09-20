/**
 * @(#)Assign3.java
 *
 *
 * @author
 * @version 1.00 2018/9/20
 */

package set19;
import java.util.*;
public class Assign3 {

    public static void main(String args[])
    {
    	Scanner sc = new Scanner(System.in);
    	System.out.print("Enter n: ");int n = sc.nextInt();

    	int a[] = new int[n];
    	System.out.println("Enter elements in array");
    	for(int i=0; i<a.length; i++)
    		a[i] = sc.nextInt();

    	System.out.println("Elements of array");
    	for(int i=0; i<a.length; i++)
    		System.out.print(" "+a[i]);

    	System.out.println();

    	int bin[] = getBin(a);
    	System.out.println("Binary elements of array");
    	for(int i=0; i<a.length; i++)
    		System.out.print(" "+bin[i]);

    	System.out.println();
    }

    static int[] getBin(int b[])
    {

    	for(int i=0; i<b.length; i++)
    	{
    		int rev = 0;
    		int j;
    		int s = 0;
    		for(j=b[i]; j>0; j--)
    		{
    			int r = b[i] % 2;
    			rev = rev + (int)Math.pow(10,s++)* r;
    			b[i] /= 2;
    		}
    		b[i] = rev;
    	}
		return b;
    }


}