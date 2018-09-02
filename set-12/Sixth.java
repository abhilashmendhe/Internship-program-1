/**
 * @(#)Sixth.java
 *
 *
 * @author
 * @version 1.00 2018/8/28
 */

package set12;
public class Sixth {

    public static void main(String args[])
    {
    	int n=1001, p=0, s=0;

    	while(n>0)
    	{
    		int r=n%10;

    		p = (int) Math.pow(2,s) * r + p;
			n = n/10;
    		s++;
    	}
    	System.out.println(p);
    }


}