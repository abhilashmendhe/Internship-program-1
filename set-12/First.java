/**
 * @(#)First.java
 *
 *
 * @author
 * @version 1.00 2018/8/28
 */

package set12;

public class First {

    public static void main(String args[])
    {

    	int fact=1,n=6;

    	while(n>=1)
    	{
    		fact *= n;
    		n--;
    	}
    	System.out.println(fact);
    }

}