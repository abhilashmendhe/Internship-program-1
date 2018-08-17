/**
 * @(#)Assign10.java
 *
 *
 * @author
 * @version 1.00 2018/8/17
 */

package set7;
import java.util.*;
public class Assign10 {

    public static void main(String args[])
    {
    	System.out.println("Numbers which are divisible by 3 and 7");

    	for(int i=1; i<=100; i++)
    	{
    		if(i%3==0 && i%7==0)
    			System.out.println(i);
    	}
    }


}