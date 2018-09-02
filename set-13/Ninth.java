/**
 * @(#)Ninth.java
 *
 *
 * @author
 * @version 1.00 2018/8/29
 */

package set13;
public class Ninth {

    public static void main(String args[])
    {
    	double count=1;
    	double i=1,n=5;
double sum = 0;
    	do
    	{
    		if(i%2!=0)
    		{
    		//	System.out.print(" "+i);
			sum += (1/Math.pow(i,2));
    		count++;
    		}
    		i++;

    	}while(i<=n);

    	System.out.println(sum);
    }
}