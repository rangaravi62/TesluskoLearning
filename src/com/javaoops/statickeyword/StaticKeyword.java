package com.javaoops.statickeyword;

public class StaticKeyword {
    public static float pi = 3.14f;
    int i =5;
    static void method1(){
        System.out.println(pi);
//        System.out.println(i);   //Non-static field 'i' cannot be referenced from a static context
    }

    void method2(){
        System.out.println(pi);
        System.out.println(i);
    }
    {
        System.out.println("eee");
    }

}
