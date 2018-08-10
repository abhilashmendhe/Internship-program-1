/**
 * @(#)Assign4.java
 *
 *
 * @author
 * @version 1.00 2018/8/7
 */

package set3;
public class Assign4 {

    public static void main(String args[]){
    	int number = 2;

    	String ans = ( number == 0)? "The number is zero (Neither +ve nor -ve)" : ( number > 0 )? "Is a +ve number" : "Is a -ve number";
    	System.out.println(ans);
    }


}