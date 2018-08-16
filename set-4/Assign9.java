/**
 * @(#)Assign9.java
 *
 *
 * @author
 * @version 1.00 2018/8/16
 */

package set4;
public class Assign9 {

    public static void main(String args[]){

    	byte x=10, y=8, z=5;
    	x &= 2;
    	y |= 10;
    	z ^= 6;
    	System.out.println("__AND__"+ x);
    	System.out.println("__OR__"+ y);
		System.out.println("__XOR__"+z);
    	}

}