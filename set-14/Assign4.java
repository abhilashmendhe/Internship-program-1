/**
 * @(#)Assign4.java
 *
 *
 * @author
 * @version 1.00 2018/9/3
 */

package set14;
import java.util.*;
public class Assign4 {

    public static void main(String args[])
    {
    	Scanner sc = new Scanner(System.in);
    	System.out.print("Enter n: ");int n = sc.nextInt();

		int a[] = new int[n];
		int sum = 0;
		System.out.println("Enter elements in arrays");
		for(int i=0; i<a.length; i++)
		{
			a[i] = sc.nextInt();
		}

		for(int j=0; j<a.length; j++)
		{
			sum += a[j];
		}
		System.out.println("Addition of n arrays is "+sum);
    }


}