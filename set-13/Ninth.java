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
    	double i=1,n=4;
double sum = 0;
    	do
    	{
    		sum += (1/Math.pow(i,2));
    		count++;
    		i=i+2;

    	}while(count<=n);

    	System.out.println(sum);
    }
}