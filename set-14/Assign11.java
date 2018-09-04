/**
 * @(#)Assign11.java
 *
 *
 * @author
 * @version 1.00 2018/9/3
 */

package set14;
import java.util.*;
public class Assign11 {

    public static void main(String args[])
    {
    	Scanner sc = new Scanner(System.in);
    	System.out.print("Enter n: ");int n = sc.nextInt();
    	int a[] = new int[n];

    	System.out.println("Enter elements in array");

    	for(int i=0; i<a.length; i++)
    		a[i] = sc.nextInt();



    	int even_count = 0;
    	int odd_count = 0;
		for(int j=0; j<a.length; j++)
    	{

    		if(a[j]%2==0)
    			even_count++;

    		else
    			odd_count++;
    	}



    	int even_a[] = new int[even_count];
    	int odd_a[] = new int[odd_count];



		int k = 0;
		int l = 0;

		System.out.println("Elements of an Even array are");

		while(k<even_a.length)
		{

    		if(a[l]%2==0)
    		{
    			even_a[k] = a[l];
    			System.out.print(" "+even_a[k]);
    			k++;
    		}
    	l++;
    	}

		System.out.println();


    	int m = 0;
    	int o = 0;

    	System.out.println("Element of an Odd array are");

    	while(m<odd_a.length)
    	{
    		if(a[o]%2!=0)
    		{
    			odd_a[m] = a[o];
    			System.out.print(" "+odd_a[m]);
    			m++;
    		}
   		o++;
    	}
    }
}