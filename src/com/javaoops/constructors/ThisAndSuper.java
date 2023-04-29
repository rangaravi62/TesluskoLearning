package com.javaoops.constructors;

import com.javaoops.encapsulation.ThisKeyword;

public class ThisAndSuper {
    int a;
    int b;
    int c;

    int m,n,o;

    public ThisAndSuper(){
        a=10;
        b=20;
        c=30;
    }


    public ThisAndSuper(int a, int b) {
        this(a,b,10); //ThisAndSuper{a=40, b=45, c=30, m=40, n=45, o=10}
        this.a = a;
        this.b = b;
    }

    public ThisAndSuper(int a, int b, int c) {
        this();   // this() method will call the current class constructor // ThisAndSuper{a=10, b=20, c=30, m=2, n=3, o=4}
        this.m = a;
        this.n = b;
        this.o = c;
    }

    @Override
    public String toString() {
        return "ThisAndSuper{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                ", m=" + m +
                ", n=" + n +
                ", o=" + o +
                '}';
    }
}

class Test1{
    public static void main(String[] args) {
        ThisAndSuper t = new ThisAndSuper(2,3,4);
        System.out.println(t.toString());
        ThisAndSuper t1 =new ThisAndSuper(40,45);
        System.out.println(t1.toString());

    }
}
