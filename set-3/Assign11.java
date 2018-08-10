/**o
 * @(#)Assign11.java
 *
 *
 * @author
 * @version 1.00 2018/8/8
 */
package set3;

public class Assign11 {

   	public static void main(String args[])
   		{
   			int marks = 75;
   			String ans = ( marks >= 0 && marks <= 35 ) ? "Fail" : ( marks >= 36 && marks <= 40 ) ? "Pass Class" : ( marks >= 41 && marks <= 50 ) ? "3rd Division" :
   				( marks >= 51 && marks <= 60 ) ? "2st Division" : ( marks >= 61 && marks <= 70 ) ? "1st Division" : ( marks >= 71 && marks <=100) ? "Distinction" : "Marks Invalid";

   			System.out.println(ans);
   		}

}