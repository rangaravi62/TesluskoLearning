package com.javaoops.encapsulation;

public class ThisKeyword {
    private int age;
    public void setAge(int age) {
        age = age; // this is called shadowing problem,to differentiate between instance var and var passed in the setter we use this keyword
    }

    public int getAge() {
        return age;
    }
}


class Test3{
    public static void main(String[] args) {
        ThisKeyword t =new ThisKeyword();
        t.setAge(5); // even though we are passing 5 it is printing 0
        System.out.println(t.getAge());
    }
}
