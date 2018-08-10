/**
 * @(#)Assign8.java
 *
 *
 * @author
 * @version 1.00 2018/8/7
 */

package set3;
public class Assign8 {

   public static void main (String args[]){

   		int b = 3, a = 4, c = 6;

  		double compute = (double)Math.pow(b,2) - ( 4 * a * c );
  		String ans = ( compute < 0 ) ? "Roots are Imaginary" :
  			         ( compute > 0 ) ? "Roots are real" : "Roots are equal";

  			         System.out.println(ans);
   	}

}