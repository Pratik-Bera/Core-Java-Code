package pack2;
import java.util.Scanner;
import pack1.Addition;

public class Executer {
    public static void main(String[] args){
        System.out.println("It's user pack2 package Executer class.");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter First Number :");
        int a=sc.nextInt();
        System.out.println("Enter Second Number :");
        int b=sc.nextInt();
        Addition a1=new Addition();
        a1.add(a,b);
        
        
    }
    
}
