/**
 * @(#)Fourth.java
 *
 *
 * @author
 * @version 1.00 2018/8/28
 */

package set12;
public class Fourth {

    public static void main(String args[])
    {
    	int n=4351;
		int rev = 0;
    	while(n>0)
    	{
    		int r = n % 10;
			rev = rev*10 + r;
    		n = n / 10;
    	}
    	System.out.println(rev);
      }

}