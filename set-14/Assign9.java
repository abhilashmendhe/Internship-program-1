/**
 * @(#)Assign9.java
 *
 *
 * @author
 * @version 1.00 2018/9/3
 */

package set14;
import java.util.*;
public class Assign9 {

    public static void main(String args[])
    {
    	Scanner sc = new Scanner(System.in);
    	System.out.print("Enter n: "); int n = sc.nextInt();

    	int a[] = new int[n];

    	System.out.println("Enter elements in array");
    	for(int i=0; i<a.length; i++)
    	{
    		a[i] = sc.nextInt();
    	}
		int prime_count=0;
		for(int k=0; k<a.length; k++)
		{

		boolean f = true;
		for(int j=2; j<a[k]; j++)
		{
			if(a[k]%j==0)
			{
				f = false;
				break;
			}
		}
		if(f){
			//System.out.print(" "+a[count]);
			prime_count++;
		}

		}
		System.out.println("Count of prime numbers in arrays are "+prime_count);
    }

}