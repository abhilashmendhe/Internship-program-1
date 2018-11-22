/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package set36_1;

/**
 *
 * @author abhil
 */
import java.util.*;
public class Set36_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
        
        LinkedList list = new LinkedList();
       
        int ch = 1; 
        do{
            System.out.println("1) Push");
            System.out.println("2) Pop");
            System.out.println("3) Display");
            System.out.println("-------------");
            System.out.print("Enter Choice: ");int choice = sc.nextInt();
            switch(choice)
            {
                case 1:
                    System.out.print("Enter element in Queue: ");int n = sc.nextInt();
                    list.addFirst(n);
                    break;
                case 2:
                    if(list.isEmpty())
                        System.out.println("Queue Empty");
                    else
                        list.removeLast();
                    break;
                case 3:
                    System.out.println(list);
                    break;
                default:
                    System.out.println("Invalid Choice");
                    break;
            }
            
            System.out.println("To continue 1 or 0 to stop");
            ch = sc.nextInt();
        }while(ch==1);
    }
    
}
