package com.blogic;
import com.operation.*;

public class Logic{
    public double executer(double a,double b,char op){
        double d1=0.0d;
        if(op=='+'){
            Addition add=new Addition();
            d1=add.add(a,b);
        }
        else if(op=='-'){
            Substraction sub=new Substraction();
            d1=sub.sub(a,b);
        }
        else if(op=='*'){
            Multiplication mul=new Multiplication();
            d1=mul.mul(a,b);
        }
        else if(op=='/'){
            Division div=new Division();
            d1=div.div(a,b);
        }
        return d1;


    }

}