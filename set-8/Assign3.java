/**
 * @(#)Assign3.java
 *
 *
 * @author
 * @version 1.00 2018/8/17
 */

package set8;
import java.util.*;

public class Assign3 {

    public static void main(String args[])
    {
    	System.out.println("Enter n");
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();

    	int fact = 1;

    	for (int i=1; i<=n; i++)
    	{
    		fact *= i;
    	}
    	System.out.println(fact);
    }


}