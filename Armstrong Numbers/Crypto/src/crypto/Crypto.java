/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crypto;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.ArrayList;

/**
 *
 * @author abhil
 */
public class Crypto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     
        MainFrame mf = new MainFrame();
        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
        mf.setVisible(true);
        mf.setSize(d);
        
        String st = "CRYPTOGRAPHY";
        
        ArrayList<String> starr = new BlockMaker().getBlocks(st);
        System.out.println(starr);
        double arm[] = {1,5,3,1,25,9,1,125,27,1,5,3};
        float armmat[][] = {{1,5,3},{1,25,9},{1,125,27}};
        float mat[][] = new float[3][4];
        
        for(int i=0; i<starr.size(); i++)
        {
            int k=0,l=0;
            int tmp = 1;
            for(int j=0; j<starr.get(i).length(); j++)
            {
                char ch = starr.get(i).charAt(j);
                double x = (int)ch+arm[j];
                
                if(tmp++%4!=0)
                {
                    mat[k++][l] = (float) x;
                }
                else
                {
                    k=0;
                    l++;
                    j--;
                }
            }
        }
        
        System.out.println("Matrix to encrypt");
        for(int i=0; i<mat.length; i++)
        {
            for(int j=0; j<mat[0].length; j++)
                System.out.print(" "+Math.round(mat[i][j]));
            System.out.println();
        }
            
              
        
        System.out.println("Ecnrypted matrix");
        float encmat[][] = new Product().getProduct(armmat, mat);
        for(int i=0; i<encmat.length; i++)
        {
            for(int j=0; j<encmat[0].length; j++)
                System.out.print(" "+encmat[i][j]);
            
            System.out.println();
        }
                
        
        float arminvmat[][] = new Inverse().getInverse(armmat);
        System.out.println("Inverse matrix");
        for(int i=0; i<arminvmat.length; i++)
        {
            for(int j=0; j<arminvmat[0].length; j++)
                System.out.print(" "+arminvmat[i][j]);
            System.out.println();
        }
        float decmat[][] = new Product().getProduct(arminvmat, encmat);
        
        System.out.println("Dec Matrix");
        for(int i=0; i<decmat.length; i++)
        {
            for(int j=0; j<decmat[0].length; j++)
                System.out.print(" "+Math.round(decmat[i][j]));
            System.out.println();
        }
        
      
    }

    
}
