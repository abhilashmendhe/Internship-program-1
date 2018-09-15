/**
 * @(#)Seventh.java
 *
 *
 * @author
 * @version 1.00 2018/9/14
 */

package set18;
public class Seventh {

    public static void main(String args[])
    {
    	int n = 18;
    	checkPrime(n);
    }

    static void checkPrime(int num)
    {
    	boolean f = true;
    	for(int i=2; i<num; i++)
    	{
    		if(num%i==0)
    		{
    			f = false;
    			break;
    		}
    	}

    	if(f)
    		System.out.println("It's a prime number");
    	else
    		System.out.println("It's a composite number");
    }
}