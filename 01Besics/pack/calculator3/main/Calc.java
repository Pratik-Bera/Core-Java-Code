/* This is the executer of Calculator program. and it calls the Addition class which is in another package.
 * The Class Addition will called using import statement. 
 * @Author Pratik Bera
 * Date : 05-04-2023
 * JDK 17
 */

 package pack.calculator3.main;
 import java.util.Scanner;
 import pack.calculator3.blogic.Addition;
 class Calc{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st number :");
        int a=sc.nextInt();
        System.out.println("Enter 2nd number :");
        int b=sc.nextInt();
        Addition a1=new Addition();
        a1.add(a,b);
    }
 }