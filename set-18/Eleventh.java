/**
 * @(#)Eleventh.java
 *
 *
 * @author
 * @version 1.00 2018/9/14
 */

package set18;
import java.util.*;
public class Eleventh {

    public static void main(String args[])
    {

    	Scanner sc = new Scanner(System.in);
    	System.out.print("Enter n: ");int n = sc.nextInt();
    	int a[] = new int[n];

    	System.out.println("Enter elements in array");
    	for(int i=0; i<a.length; i++)
    		a[i] = sc.nextInt();

    	int sum = getSumArr(a);
    	System.out.println("Sum of array elements: "+sum);
    }

    static int getSumArr(int b[])
    {
    	int sum = 0;
    	for(int i=0; i<b.length; i++)
    		sum += b[i];
    return sum;
    }

}