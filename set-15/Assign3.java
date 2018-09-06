/**
 * @(#)Assign3.java
 *
 *
 * @author
 * @version 1.00 2018/9/4
 */

package set15;
import java.util.*;
public class Assign3 {

    public static void main(String args[])
    {
    	Scanner sc = new Scanner(System.in);
    	System.out.print("Enter n: ");int n = sc.nextInt();
    	int a[] = new int[n];
       	for(int i=0; i<a.length; i++)
       	{
       		a[i] = sc.nextInt();
       	}


		System.out.println("Enter first element: "); int x = sc.nextInt();
		System.out.println("Enter second element: "); int y = sc.nextInt();

		int pos1=-1;
		int pos2=-1;
		for(int j=0; j<a.length; j++)
		{
			if(a[j] == x)
				pos1 = j;
			if(a[j] == y)
				pos2 = j;
		}


			int tmp = a[pos1];
			a[pos1] = a[pos2];
			a[pos2] = tmp;


		for(int i=0; i<a.length; i++)
		{
			System.out.print(" "+a[i]);
		}
    }


}