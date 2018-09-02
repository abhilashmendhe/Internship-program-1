/**
 * @(#)Assign11.java
 *
 *
 * @author
 * @version 1.00 2018/9/2
 */

package set10;
import java.util.*;
public class Assign11 {

    public static void main(String args[])
    {
    	Scanner sc = new Scanner(System.in);
    	System.out.print("Enter n: ");int n = sc.nextInt();

    	double a=1;
		double compute = 0;
    	while(a<=n)
    	{
    		if(a%2!=0){
    			compute += 1/a;
    		}
    		else
    		{
    			compute -= 1/a;
    		}
    		a++;
    	}
    	System.out.println("Sum of following series is "+compute);
    }


}