/*This is a addition calculator taking input and calculate sum of two digits by help of Addition.java .
 * @Author Pratik Bera
 * JDK 17
 * Date 04-04-2023
*/
package calculator;
import java.util.Scanner;
class Calculator{
    public static void main(String[] args){
        int a,b;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter First Number :");
        a=sc.nextInt();
        System.out.println("Enter Second Number :");
        b=sc.nextInt();
        Addition a1=new Addition();
        int z=a1.add(a,b);
        a1.display(z);
        //System.out.println("Jar file Executed ...");


    }
}