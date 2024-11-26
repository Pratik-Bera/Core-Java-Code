
package pack1;
public class TestWithDT{
    public static void main(String[] args){
        int a=58;
        //int b=5.8;        //possible lossy conversion from double to int.
        //a=a+7.5;          //possible lossy conversion from double to int.
        //a=5+2.5;          //giving error same
        //a=5*5.2;          // error
        a=7/2;              // Not giving Error only takes Integer part only.
        System.out.println(a);
    }
}