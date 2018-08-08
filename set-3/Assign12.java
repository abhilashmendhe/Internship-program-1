/**
 * @(#)Assign12.java
 *
 *
 * @author
 * @version 1.00 2018/8/8
 */

package set3;
public class Assign12 {

    public static void main(String args[]){
    		int sal = -00000;

    		String ans = ( sal <= 0 ) ? "Someone's working for free and is in debt!!" : ( sal < 15000) ? "Peon" :
    					 ( sal >= 15001 && sal < 25000 ) ? "2nd Division Clerk" :
    					 ( sal >= 25001 && sal < 35000 ) ? "1st Division Clerk" :
    					 ( sal >= 35001 && sal < 45000 ) ? "Assistant Manageer" :
    					 ( sal >= 45001 && sal < 60000 ) ? "Manager" : "Designation higher than Manager";

    					 System.out.println(ans);
    	}


}