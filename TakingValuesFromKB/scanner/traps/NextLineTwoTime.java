/*Note : If you are using nextLine() method after any another nextLine() method.It means you using nextLine() method 2 times
 *for taking input purpose.Then you no need to take extra nextLine() method.because first nextLine taking all in the line
 *so Scanner class is empty and ready for holding screen for Input.
*/
import java.util.Scanner;


public class NextLineTwoTime {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter Your Name : ");
        String sName=scn.nextLine();
        System.out.println("Enter Course Name : ");
        String sCourse=scn.nextLine();
        System.out.println("Roll Name : "+sName);
        System.out.println("Course Name : "+sCourse);
    }
}