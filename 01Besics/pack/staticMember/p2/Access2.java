package src.pack.staticMember.p2;
import static src.pack.staticMember.p1.Support1.i;
import static src.pack.staticMember.p1.Support1.m1;
class Access2{
    public static void main(String[] args){
        System.out.println(i);          //use directly by static member name by importing it.
        m1();
    }
}