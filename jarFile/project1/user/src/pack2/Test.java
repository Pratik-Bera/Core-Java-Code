package pack2;

public class Test {
    public static void main(String[] args){
        System.out.println("This is user folder src pack2 package Test class");
        pack1.Api1 a1=new pack1.Api1();
        a1.m1();
        pack1.Api2sum a2=new pack1.Api2sum();
        a2.add(5, 45);
    }
    
}
