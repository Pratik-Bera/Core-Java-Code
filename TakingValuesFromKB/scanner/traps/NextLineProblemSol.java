/*Note : If you are using nextLine() method after any another nextXXX() method (e.g. nextInt(),nextDouble() etc... 8 method) 
 * then you need to use it twice 
 * one for taking 'Enter character'
 * another for taking input.
*/
import java.util.Scanner;


public class NextLineProblemSol {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter Roll Number : ");
        int sRoll=scn.nextInt();
        System.out.println("Enter Your Name : ");
        scn.nextLine();String sName=scn.nextLine();
        System.out.println("Roll Number : "+sRoll);
        System.out.println("Roll Name : "+sName);
    }
}
