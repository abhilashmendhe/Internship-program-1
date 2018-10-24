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
public class Percentage extends Student{

    private double percentage;
    
    public void getPercentage(double p)
    {
        percentage = p;
    }
    
    public void getAvg()
    {
        double avg = (percentage + retPercentage())/2;
        System.out.println("Average is "+avg);
        System.out.println("-------------------------------------------");
    }
}
