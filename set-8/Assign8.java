/**
 * @(#)Assign8.java
 *
 *
 * @author
 * @version 1.00 2018/8/17
 */

package set8;
import java.util.*;
public class Assign8 {

    public static void main(String args[])
    {
    	System.out.println("Enter number");
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	int n1=0,n2=1;
    	System.out.print(n1+" "+n2);
    	for(int i=3; i<=n; i++)
    	{
    		int fib = n1+n2;
			System.out.print(" "+fib);
    		n1 = n2;
    		n2 = fib;
    	}
    }

}