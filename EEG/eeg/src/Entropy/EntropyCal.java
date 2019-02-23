/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entropy;

import java.text.DecimalFormat;

/**
 *
 * @author abhilash
 */
public class EntropyCal {
    
public double  getEntropyGain(int c,int a,int b)
    {

   //int a=9, b=5,c=14;

   // System.out.println("C= "+c+" A= "+a+" B= "+b);
    Double dt=0.0;
    if(a==c)
    {
        dt=1.0;
    }
    
 else if(b==c)
    {
     dt=0.0;
    }
 else if(a==b)
 {
     dt=0.5;
 }
 else
    {
       double k1=(double)a/c;
     
       double k2=(double)b/c;
 
       double l1;
      
       l1=Math.log(k1)/Math.log(2);

       double l2;

       l2=Math.log(k2)/Math.log(2);;

     
       double d=  (double)- (k1*l1)-(k2*l2);// (Math.log(a/c));//- (a/c) (Math.log(a/c));
       d=Math.abs(d);
      
     if(b>a)
     {
         d=1-d;
     }

       DecimalFormat df1=new DecimalFormat("#.###");
       String format = df1.format(d);
       dt=Double.parseDouble(format);
       


    }
     
    return dt;
    }
}
