/*Use This 3 import statement for using classes in the program. */
import java.io.BufferedReader;                   
import java.io.InputStreamReader;
import java.io.IOException;

//import java.io.*;     /*Other wise use this import statement. */


public class Addition {
    public static void main(String[] args) throws IOException{     /*Throws IOException will handle the Input mismatch that will be handled by JVM */ 
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); // Createing new BufferedReader obj.
        // System.in is the object represented KB and data taken from system.in by InputStreamReader and convert them to reader type.Then send it to BR classes.
        System.out.print("Enter First Number : ");
        int a=Integer.parseInt(br.readLine());         // Here we are taking a Input then convert it into Integer by using wrapper class.
        System.out.print("Enter Second Number : ");
        int b=Integer.parseInt(br.readLine());
        int result=add(a,b);
        System.out.println("The addition result is :"+result);
    }


    static int add(int a,int b){
        return (a+b);
    }
    
}
