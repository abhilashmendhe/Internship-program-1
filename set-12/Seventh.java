/**
 * @(#)Seventh.java
 *
 *
 * @author
 * @version 1.00 2018/8/28
 */

package set12;
public class Seventh {

    public static void main(String args[])
    {
    	int p=1000,r=10;
		int n=2000;
    	while(p<=n)
    	{
 			int t = (p*r) / 100;
 			p = p + t;
 			System.out.println(p);
    	}
     }

}