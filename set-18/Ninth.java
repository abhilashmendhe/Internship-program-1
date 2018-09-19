 /**
 * @(#)Ninth.java
 *
 *
 * @author
 * @version 1.00 2018/9/14
 */

package set18;
public class Ninth {

    public static void main(String args[])
    {
    	int p = 1000;
    	int n = 5;
    	int r = 4;

    	double ci = getCI(p,n,r);
    	System.out.println("Compund Interest is "+ci);
    }

    static double getCI(int p, int n, int r)
    {
    	double all = p;
		double si = 0;
    	for(int i=1; i<=n; i++)
    	{
    		si = (double)(all*n*r)/100;
    		all += si;

    	System.out.println(all);
    	}
    	return all;
    }

}