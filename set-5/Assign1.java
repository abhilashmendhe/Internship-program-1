/**
 * @(#)Assign1.java
 *
 *
 * @author
 * @version 1.00 2018/8/13
 */
package set5;

import java.util.*;

public class Assign1 {


   public static void main(String args[]){
   		System.out.println("Take two even nos");
   		Scanner sc=new Scanner(System.in);

   		int a = sc.nextInt();
   		int b = sc.nextInt();

   	if ( a%2 == 0 && b%2 == 0)



   		{
   				System.out.println("Before swap a is: "+a);
    System.out.println("Before swap b is: "+b);



   		 a = a + b;
   		 b = a - b;
   		 a = a - b;

   		     System.out.println("After swap a is: "+a);
    System.out.println("After swap b is: "+b);
   		}


   	}

}