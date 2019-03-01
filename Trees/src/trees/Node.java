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
public class Node {

    public int data;
    public Node left;
    public Node right;
    public Node up;
    public Node(int data)
    {
        this.data = data;
        left = null;
        right = null;
        up = null;
    }
}
