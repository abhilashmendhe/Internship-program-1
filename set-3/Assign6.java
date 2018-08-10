/**
 * @(#)Assign6.java
 *
 *
 * @author
 * @version 1.00 2018/8/7
 */

package set3;
public class Assign6 {

    public static void main(String args[]){

    	 int x = -1 , y = 4;

    	 String ans = ( x > 0 && y > 0)? "It's in First quadrant" :
    	 	          ( x < 0 && y > 0)? "It's in Second quadrant" :
    	 	          ( x < 0 && y < 0)? "It's in Third quadrant" :
    	 	          ( x > 0 && y < 0)? "It's in Fourth quadrant" :
    	 	          ( x == 0 && y == 0)? "It's in origin" :
    	 	          ( x == 0 && y > 0)? "Value of x is zero and the value of y is +ve axis" :
    	 	          ( x == 0 && y < 0)? "Value of x is zero and the value of y is -ve axis" :
    	 	          ( x > 0 && y == 0)? "Value of y is zero and the value of x is +ve axis" : "Value of y is zero and the value of x is -ve axis" ;

    	  System.out.println(ans);
    	 	          }


}