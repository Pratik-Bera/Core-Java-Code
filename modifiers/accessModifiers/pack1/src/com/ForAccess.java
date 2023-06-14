package com;

public class ForAccess {
    private int i=12;
            int j=13;
    protected int k=14;
    public int l=15;

    public static void main(String[] args){
        com.ForAccess t1=new com.ForAccess();
        System.out.println(t1.i);
        System.out.println(t1.j);
        System.out.println(t1.k);
        System.out.println(t1.l);
    }
    
}
