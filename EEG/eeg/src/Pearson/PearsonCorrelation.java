/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pearson;

import java.text.DecimalFormat;

/**
 *
 * @author abhilash
 */
public class PearsonCorrelation {
    private double sumX;
    private double sumY;
    private double sumXY;
    private double r;

    private double sumsqX;
    private double sumsqY;
    private double n;

    public double getCorrelation(double x[],double y[])
    {

      //  System.out.println("fff ");
            findSum(x,y);
            double num=sumXY-((double)(sumX*sumY)/n);
            double  den1stpart=sumsqX-((sumX*sumX)/n);
            den1stpart=Math.sqrt(den1stpart);
            double  den2ndpart=sumsqY-((sumY*sumY)/n);
            den2ndpart=Math.sqrt(den2ndpart);
            double den=den1stpart*den2ndpart;
            if(den!=0.0)
                    r=num/den;
            else
                    r=0.0;
             decimalformat();
    //         System.out.println("num:"+num);
    //         System.out.println("den:"+den);
            return r;

    }

    private void findSum(double x[],double y[])
    {
            n=x.length;
           sumX=findSum(x);
           sumY=findSum(y);
           double xy[]=findXY(x,y);
           sumXY=findSum(xy);
            double sqX[]=findSquare(x);
           double sqY[]=findSquare(y);
           sumsqX=findSum(sqX);
           sumsqY=findSum(sqY);

    //       System.out.println("sumX: "+sumX);
    //       System.out.println("sumY: "+sumY);
    //       System.out.println("sumXY: "+sumXY);
    //       System.out.println("sumsqX: "+sumsqX);
    //       System.out.println("sumsqY: "+sumsqY);


    }

    private double findSum(double m[])
    {
             double sum=0;
        for(int i=0;i<m.length;i++)
        {
            sum=sum+m[i];
        }
       return sum;
    }

    private double[] findXY(double x[],double y[])
    {
             double XY[]=new double[x.length];
        for(int i=0;i<XY.length;i++)
        {
            XY[i]=x[i]*y[i];
        }
        return XY;
    }

    private double[] findSquare(double m[])
    {
             double sq[]=new double[m.length];
                for(int i=0;i<sq.length;i++)
                {
                    sq[i]=m[i]*m[i];
                }

           return sq;
    }

    private void decimalformat()
    {
        DecimalFormat df=new DecimalFormat("#.##");
        String rr=df.format(r);

        r=Double.parseDouble(rr);

    }
}
