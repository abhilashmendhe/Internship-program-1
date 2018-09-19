/**
 * @(#)Eleventh.java
 *
 *
 * @author
 * @version 1.00 2018/8/28
 */

package set12;
import java.util.*;
public class Eleventh {

    public static void main(String args[])
    {
    	Scanner sc = new Scanner(System.in);
    	int i=1;
    	double sum=0;
    	System.out.print("Enter n: ");int n=sc.nextInt();
		int j=1;
    	while(i<=n)
    	{
    		double pow = 1;

    		pow *=  Math.pow(i,i);

    		sum = (double)(sum + (i/pow));

    		i++;
    	}
    	System.out.println(sum);
    }

}