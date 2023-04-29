package com.javaoops.constructors;

public class Constructor1 {
    private int age;
    private String name;
    public Constructor1() {
    }

    public Constructor1(int age){
        this.age = age;
    }

    public Constructor1(int age,String name ){
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Constructor1{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}



class Test{
    public static void main(String[] args) {
        Constructor1 c = new Constructor1(5);
        System.out.println(c.toString());
        c = new Constructor1(10,"ravi");
        System.out.println(c.toString());
    }
}


