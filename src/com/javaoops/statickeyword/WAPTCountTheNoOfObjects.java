package com.javaoops.statickeyword;

public class WAPTCountTheNoOfObjects {
    int age;
    String name;
    static int count;

    {
        count++; // will be executed for all the objects before invoking the constructor
    }

    public WAPTCountTheNoOfObjects(){

    }

    public WAPTCountTheNoOfObjects(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public WAPTCountTheNoOfObjects(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        WAPTCountTheNoOfObjects w1=new WAPTCountTheNoOfObjects();
        WAPTCountTheNoOfObjects w2=new WAPTCountTheNoOfObjects(35,"Rohit");
        WAPTCountTheNoOfObjects w3=new WAPTCountTheNoOfObjects();
        WAPTCountTheNoOfObjects w4=new WAPTCountTheNoOfObjects(35);
        System.out.println(count);

    }
}
