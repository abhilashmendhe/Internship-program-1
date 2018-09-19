/**
 * @(#)Twelevth.java
 *
 *
 * @author
 * @version 1.00 2018/9/2
 */

package set12;
import java.util.*;
public class Twelevth {

    public static void main(String args[])
    {
    	Scanner sc = new Scanner(System.in);
    	System.out.print("Enter n: ");int n = sc.nextInt();
    	System.out.print("Enter the value of x: "); double x = sc.nextDouble();

    	int i = 2;
    	double compute = 1/(x+1);
    	while(i<=n)
    	{
    		if(i%2==0)
    			compute += i/(x+i);
    		else
    			compute -= i/(x+i);

    		i++;
    	}
    	System.out.println("Sum of the series is "+compute);
    }


}