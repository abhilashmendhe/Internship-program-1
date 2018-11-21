/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package set28_14;

/**
 *
 * @author abhil
 */
public class Cal implements SI, CI{

    @Override
    public void getSI() {
        int p = 16000;
        int n = 2;
        
        double si = p * n * (SI_r/100);
        System.out.println("SI is "+si);
    }

    @Override
    public void getCI() {
        int p = 16000;
        int n = 2;
        double ci = 0;
        for(int i=1; i<=n; i++)
        {
            double si = p * (CI_r/100);
            ci += si;
            p += si;
        }
        System.out.println("CI is "+ci);
    }
    
}
