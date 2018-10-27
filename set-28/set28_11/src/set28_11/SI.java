/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package set28_11;

/**
 *
 * @author abhil
 */
public class SI extends Interest{
    
    int p,n,r;
    
    public void getPNR(int p, int n, int r)
    {
        this.p = p;
        this.n = n;
        this.r = r;
    }
    public void findInterest()
    {
        double si = (double)(p*n*r)/100;
        System.out.println("SI is "+si);
    }
}
