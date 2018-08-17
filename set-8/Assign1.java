/**
 * @(#)Assign1.java
 *
 *
 * @author
 * @version 1.00 2018/8/17
 */

package set8;
public class Assign1 {

    public static void main(String args[])
    {
    	System.out.println("Numbers which are divisible by 9 and not by 6 are");
		for(int i=567; i>=134; i--)
		{
			if(i%9==0 && i%6!=0)
				System.out.println(i);
		}
    }


}