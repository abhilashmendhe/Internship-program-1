/**
 * @(#)Fourteen.java
 *
 *
 * @author
 * @version 1.00 2018/9/19
 */

package set18;
import java.util.*;
public class Fourteen {

    public static void main(String args[])
    {
    	Scanner sc = new Scanner(System.in);
		System.out.print("Enter n: ");int n = sc.nextInt();
		int a[] = new int[n];
		System.out.println("Enter elements in array");

		for(int i=0; i<a.length; i++)
			a[i] = sc.nextInt();

		System.out.println("Elements of array are");
		for(int i=0; i<a.length; i++)
			System.out.print(" "+a[i]);

		getOps(a);
    }

	static void getOps(int b[])
	{
		int pc = getPC(b);
		int nc = getNC(b);
		int zc = getZC(b);

		System.out.println("\n\nCount of positive numbers: "+pc);
		System.out.println("Count of negative numbers: "+nc);
		System.out.println("Count of zero numbers: "+zc);
	}

	static int getPC(int b[])
	{
		int positive_count = 0;
		for(int i=0; i<b.length; i++)
		{
			if(b[i]>0)
				positive_count++;
		}

		return positive_count;
	}

	static int getNC(int b[])
	{
		int negative_count = 0;
		for(int i=0; i<b.length; i++)
		{
			if(b[i]<0)
				negative_count++;
		}

		return negative_count;
	}

	static int getZC(int b[])
	{
		int zero_count = 0;
		for(int i=0; i<b.length; i++)
		{
			if(b[i]==0)
				zero_count++;
		}

		return zero_count;
	}
}