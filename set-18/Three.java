/**
 * @(#)Three.java
 *
 *
 * @author
 * @version 1.00 2018/9/14
 */

package set18;
public class Three {

    public static void main(String args[])
    {

    int r = getReverse();
    int j = getReverse();
    System.out.println("Reverse is "+r);

    }

    static int getReverse()
    {
    	int num = 100201;
    	int rev = 0;
    	while(num>0)
    	{
    		int r = num % 10;
    		rev = rev * 10 + r;
    		num = num / 10;
    	}

    	return rev;
    }



}