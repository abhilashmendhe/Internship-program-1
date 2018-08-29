/**
 * @(#)Fourth.java
 *
 *
 * @author
 * @version 1.00 2018/8/29
 */

package set13;
public class Fourth {

    public static void main(String args[])
    {
		int i=1, n=10;
		int n1=0, n2=1;
		int fib=0;
		do
		{	fib = fib + n1;
			n1=n2;
			n2=fib;
			System.out.print(fib+" ");
			i++;
		}while(i<=n);
    }


}