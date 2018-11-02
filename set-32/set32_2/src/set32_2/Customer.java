/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package set32_2;

/**
 *
 * @author abhil
 */
public class Customer {
    
    public String name;
    public int acc_no;
    public double bal;
    
    public void getData(String n, int acc_no, double bal)
    {
        name = n;
        this.acc_no = acc_no;
        this.bal = bal;
    }
}
