package com;

public class SamePackOtherClass {
    public static void main(String[] args){
        com.ForAccess t1=new com.ForAccess();
        //System.out.println(t1.i);    //error: i has private access in ForAccess
        System.out.println(t1.j);
        System.out.println(t1.k);
        System.out.println(t1.l);
    }
    
}
