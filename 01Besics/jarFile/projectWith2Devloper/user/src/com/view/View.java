package com.view;
import com.blogic.Logic;
import java.util.Scanner;
public class View {
    public static void main(String[] args){
        System.out.println("Enter Operand1 then Operator then Operand2 :");
        Scanner sc=new Scanner(System.in);
        double op1=sc.nextDouble();
        char c=sc.next().charAt(0);
        double op2=sc.nextDouble();
        l1=new Logic();
        double result=l1.executer(op1,op2,c);
        System.out.println(op1+" "+c+" "+op2+" = "+result);
        sc.close();

    }
    
}
