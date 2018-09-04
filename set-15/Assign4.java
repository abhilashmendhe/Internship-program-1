/**
 * @(#)Assign4.java
 *
 *
 * @author
 * @version 1.00 2018/9/4
 */

package set15;
import java.util.*;
public class Assign4 {

    public static void main(String args[])
    {
    	Scanner sc = new Scanner(System.in);
    	System.out.print("Enter n: ");int n = sc.nextInt();

    	int a[] = new int[n];

    	for(int i=0; i<a.length; i++)
    	{
    		a[i] = sc.nextInt();
    	}
    	int big = a[0];
    	int small = a[0];
    	int pos1=0,pos2=0;
    	int j,k;
    	for(j=0; j<a.length; j++)
    	{
    		if(a[j] > big)
    			big = a[j];

    		if(big==a[j]){
    			pos1 = j;
    		}
    	}
    	for(k=0; k<a.length; k++)
    	{
    		if(a[k] < small)
    			small = a[k];

    		if(small==a[k])
    			pos2 = k;
    	}


    	System.out.println("Big: "+big+" at "+pos1+"\nSmall: "+small+" at "+pos2);

		int tmp = a[pos1];
		a[pos1] = a[pos2];
		a[pos2] = tmp;

    	for(int i=0; i<a.length; i++)
    	{
    		System.out.print(" "+a[i]);
    	}
    }

}