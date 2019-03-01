/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trees;

/**
 *
 * @author root
 */
public class TreeOps {
    
    public Node root;

    public void create(int data)
    {
        Node n = new Node(data);
        System.out.println("n: "+n);
        
        if(root == null)
        {
            root = n;
            System.out.println("Root node: "+root);
            System.out.println();
        }
        else
        {
            Node current = root;
            while(current != null)
            {
                if(n.data < current.data)
                {
                    if(current.left == null)
                    {
                        current.left = n;
                        current = n;
                        //System.out.println("Current left: "+current.left+" and Current left data: "+current.data);
                        //System.out.println(current);
                        current = n.left;
                        
                    }
                    else
                    {
                        //System.out.println("before current: "+current);
                        current = current.left;
                       // System.out.println("after current: "+current);
                    }
                    
                }
                else
                {
                    if(current.right == null)
                    {
                        current.right = n;
                        current = n;
                       // System.out.println("Current right: "+current.right+" and Current right data: "+current.data);
                        current = n.right;
                       // System.out.println(current);
                    }
                    else
                    {
                       // System.out.println("after current: "+current);
                        current = current.right;
                       // System.out.println("before current: "+current);
                    }
                }
            }
            System.out.println();
        }
    }
    
    public void display()
    {
        
       Node current = root;
       Node previous = root;
       int i=0;
       while(current != null)
       {
           Node next = previous;
           System.out.println(next.up);
           if(current.left != null)
           {
               previous.up = current;
               current = current.left;
           }
//           else if(current.right != null)
//           {
//               next.up = current;
//               current = current.right;
//           }
           else
           {
               Node temp = current;
               System.out.println(current.data);
//               System.out.println(next.up);
               current = next.up;  
               previous = next.up;
               current.left = null;
           }

       }
    }
}
