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

		boolean f1 = false;
		boolean f2 = false;
		int j,k;
		for(j=0; j<a.length; j++)
		{
			if(a[j] == x)
			{
				f1 = true;
				break;
			}
		}

		for(k=0; k<a.length; k++)
		{
			if(a[k] == y)
			{
				f2 = true;
				break;
			}
		}

		if(f1 && f2)
		{
			int tmp = a[j];
			a[j] = a[k];
			a[k] = tmp;
		}
		else
		{
			System.out.println("Wrong input!!1");
		}

		for(int i=0; i<a.length; i++)
		{
			System.out.print(" "+a[i]);
		}
    }


}