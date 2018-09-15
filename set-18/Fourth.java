/**
 * @(#)Fourth.java
 *
 *
 * @author
 * @version 1.00 2018/9/14
 */

package set18;
public class Fourth {

    public static void main(String args[])
    {
    	getReverse();
    }

    static void getReverse()
    {
    	int num = 998832211;
    	int rev = 0;

    	while(num>0)
    	{
    		int r = num % 10;
    		rev = rev * 10 + r;
    		num = num / 10;
    	}
    	System.out.println("Reverse is "+rev);
    }

}