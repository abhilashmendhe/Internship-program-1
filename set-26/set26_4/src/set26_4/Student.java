/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package set26_4;

/**
 *
 * @author abhil
 */
public class Student {

    private int roll_no;
    private double percentage;
    private String name;
    
    private void getData(int r, double p, String n)
    {
        roll_no = r;
        percentage = p;
        name = n;
    }
    
    public void callData(int r, double p, String n)
    {
        getData(r, p, n);
    }
    
    public String retName()
    {
        return name;
    }
    
    public int retRoll()
    {
        return roll_no;
    }
    
    public double retPercentage()
    {
        return percentage;
    }
}
