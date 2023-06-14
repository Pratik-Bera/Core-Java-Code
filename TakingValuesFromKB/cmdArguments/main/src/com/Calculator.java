package com;
import oper.*;
class Calculator{
    public static void main(String[] args){
        double d2;
        //System.out.println(args[2]);
        int num=Integer.parseInt(args[2]);
        //System.out.println(num);
        if(num==1){
            Addition a1=new Addition();
            d2=a1.add(args);
            System.out.println("The addition result is : "+d2);
        }
        if(num==2){
            Substraction s1=new Substraction();
            d2=s1.sub(args);
            System.out.println("The substraction result is : "+d2);
        }
        if(num==3){
            Multiplication m1=new Multiplication();
            d2=m1.mul(args);
            System.out.println("The multiplication result is : "+d2);
        }
        if(num==4){
            Division d1=new Division();
            d2=d1.div(args);
            System.out.println("The division result is : "+d2);
        }
        

    }
}