package com.javaoops.statickeyword;

public class Demo {
    static int a,b,c;
    static {
        System.out.println("in static block");
        a=10;
        b=20;
        c=30;
    }
    static void disp(){
        System.out.println("in static method disp");
        System.out.println("a : "+a+" b : "+b+" c : "+c);
    }

    int m,n,o;

    //nonstatic block -> this will be loaded while creating the object even before invoking the constructor
    {
        System.out.println("in non static block");
        m=100;
        n=200;
        o=300;
        a=40;
        b=50;
        c=60;
    }
    public Demo(){
        System.out.println("in default constructor");
    }
    void disp1(){
        System.out.println("in non static method disp1");
        System.out.println("a : "+a+" b : "+b+" c : "+c+" m : "+m+" n : "+n+" o : "+o);
    }

    public static void main(String[] args) {
        disp();
        Demo d = new Demo();
        d.disp1();
    }
}
