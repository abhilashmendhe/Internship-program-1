/**
 * @(#)Assign5.java
 *
 *
 * @author
 * @version 1.00 2018/9/3
 */

package set14;
import java.util.*;
public class Assign5 {

    public static void main(String args[])
    {
    	Scanner sc = new Scanner(System.in);
    	System.out.print("Enter n: ");int n = sc.nextInt();
    	int a[] = new int[n];


    	System.out.println("Enter elements");

		for(int i=0; i<a.length; i++)
		{
			a[i] = sc.nextInt();
		}
		int big = a[0];
		for(int j=0; j<a.length; j++)
		{
			if(big < a[j])
			{
				big = a[j];
			}
		}
		System.out.println("Biggest no. is "+big);
    }

}