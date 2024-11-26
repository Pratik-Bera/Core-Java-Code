 /* Method level variable is divided in two types 1. Parameter 2. Local Variables*/
 import java.util.Scanner;
public class MethodLevelVar {
    public static void main(String[] args){
        //int a,b;
        //int[] arr;
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter First Number:");
        int a=scn.nextInt();                            //LV
        System.out.println("Enter Second Number:");
        int b=scn.nextInt();
        System.out.println("Enter the size of array:");
        int n=scn.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter the "+(i+1)+" no Element");
            arr[i]=scn.nextInt();
        }
        System.out.println("You Entered two Integer such as : "+a+" , "+b);
        System.out.println("You Entered values in array are: ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ,");
        }
        System.out.println();
        System.out.println("Calling dispArr method by passing arguments: ");
        dispArr(arr,n);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ,");
        }
        System.out.println();
        System.out.println(arr.length);

    }


    static void dispArr(int[] arr,int n){           //Parameter
        System.out.println("You Entered values in array are: ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ,");
        }
        System.out.println();
    }

 }