package com;
import com.ForAccess;

public class OtherPackOtherClass {
    public static void main(String[] args){
        com.ForAccess t1=new com.ForAccess();
        //System.out.println(t1.i);    //error: i has private access in ForAccess
        //System.out.println(t1.j);      //j is not public in ForAccess; cannot be accessed from outside package.It's Default.
        //System.out.println(t1.k);       //k has protected access in ForAccess . need to create as subclass.
        System.out.println(t1.l);
    }
    
}
