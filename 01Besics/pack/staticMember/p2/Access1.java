package src.pack.staticMember.p2;
import src.pack.staticMember.p1.Support1;
class Access1{
    public static void main(String[] args){
        Support1 s1=new Support1();

        System.out.println(s1.i);                                   // call by object reference
        System.out.println(src.pack.staticMember.p1.Support1.i);    // call by fully qualified name

        s1.m1();                                                    // call by object reference
        src.pack.staticMember.p1.Support1.m1();                     // call by fully qualified name
    }
}