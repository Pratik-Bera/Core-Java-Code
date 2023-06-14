/* This is the executer of Calculator program. and it calls the Addition class which is in another package.
 * The Class Addition will called using fully qualified name. 
 * @Author Pratik Bera
 * Date : 05-04-2023
 * JDK 17
 */

 package pack.calculator2.user;
 import java.util.Scanner;
 class Calculator{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st number :");
        int a=sc.nextInt();
        System.out.println("Enter 2nd number :");
        int b=sc.nextInt();
        pack.calculator2.blogic.Addition a1=new pack.calculator2.blogic.Addition();
        a1.add(a,b);
    }
 }