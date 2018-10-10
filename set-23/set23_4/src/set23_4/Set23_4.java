/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package set23_4;

/**
 *
 * @author abhil
 */
import java.util.*;
public class Set23_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic 
        Scanner sc = new Scanner(System.in);
        Customer arr[] = new Customer[3];
        System.out.println("Create account of "+arr.length+" customer");
        for(int i=0; i<arr.length; i++)
        {
            System.out.print("Enter name: ");String name = sc.next();
            System.out.print("Enter Account no.: ");int acc = sc.nextInt();
            System.out.print("Enter Amount: ");double bal = sc.nextDouble();
            
            arr[i] = new Customer();
            arr[i].getData(name, acc, bal);
        }
        
        Deposit d = new Deposit();
        Withdraw w = new Withdraw();
        Display print = new Display();
        
        System.out.println();
        int con = 1;
        do
        {
            System.out.println("Menu");
            System.out.println("1) Deposit");
            System.out.println("2) Withdraw");
            System.out.println("3) Display amt. with respect due account number");
            System.out.println("4) Display All");
            System.out.println("Enter choice");
            int ch = sc.nextInt();
            switch(ch)
            {
                case 1:
                    System.out.println("Enter account number");
                    int ac = sc.nextInt();
                    System.out.println("Enter amount to deposit");
                    double a = sc.nextDouble();
                    d.isDeposit(ac, a, arr);
                    break;
                case 2:
                    System.out.println("Enter account number");
                    int acc = sc.nextInt();
                    System.out.println("Enter amount to Withdraw");
                    double aa = sc.nextDouble();
                    w.getWithdraw(acc, aa, arr);
                    break;
                case 3:
                    System.out.println("Enter account number to display amount");
                    int acc1 = sc.nextInt();
                    print.displayAcc(acc1, arr);
                    break;
                case 4:
                    System.out.println("All");
                    print.displayAll(arr);
                    break;
                default:
                    System.out.println("Invalid option");
                    break;
            }
            System.out.println("To continue '1' or to end '0'");
            con = sc.nextInt();
        }while(con!=0);
        
        
        
    }
    
}
