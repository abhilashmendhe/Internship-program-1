/**
 * @(#)Eigth.java
 *
 *
 * @author
 * @version 1.00 2018/9/14
 */

package set18;
public class Eigth {

    public static void main(String args[])
    {
    	int num = 20;
    	getSumUp(num);
    }

    static void getSumUp(int n)
    {
    	int sum = 0;
    	for(int i=0; i<=n; i++)
    	{
    		if(i%9==0 && i%6!=0)
    			sum += i;
    	}

    	System.out.println("SumUp upto n numbers is "+sum);
    }
}