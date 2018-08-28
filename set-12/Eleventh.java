/**
 * @(#)Eleventh.java
 *
 *
 * @author
 * @version 1.00 2018/8/28
 */

package set12;
public class Eleventh {

    public static void main(String args[])
    {
    	int i=1;
    	double sum=0;
    	int n=3;
		int j=1;
    	while(i<=n)
    	{
    		double pow = 1;
    		while(j<=i)
    		{
    			pow *=  Math.pow(j,i);
    			j++;
    		}
    	//	System.out.println(pow);
    		sum = (double)(sum + (i/pow));

    		i++;
    		}
    	System.out.println(sum);
    }


}