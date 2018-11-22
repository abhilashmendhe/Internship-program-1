/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package set36_3;

/**
 *
 * @author abhil
 */
import java.util.*;
public class Set36_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        Queue queue = new LinkedList();
        int ch = 1;
        do{
            System.out.println("1) Push");
            System.out.println("2) Pop");
            System.out.println("3) Display");
            System.out.print("Enter choice: ");int choice = sc.nextInt();
            
            switch(choice)
            {
                case 1:
                    System.out.print("Enter element in Queue: ");int num = sc.nextInt();
                    queue.offer(num);
                    break;
                    
                case 2:
                    try {
                     queue.remove();
                       
                    } catch (Exception e) {
                        System.out.println("Queue is Empty");
                    }break;
                    
                case 3:
                    System.out.println(queue);
                    break;
                
                default:
                    System.out.println("Invalid choice");
                    break;
            }
                    
            
            System.out.println("To continue 1 or 0 to stop");
            ch = sc.nextInt();
        }while(ch==1);
    }
    
}
