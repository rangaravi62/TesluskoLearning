package com.javaoops.inheritance;

public class SingleLevel {
    String name;
    int marks;

    @Override
    public String toString() {
        return "SingleLevel{" +
                "name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }
}

class Single extends SingleLevel {
    public static void main(String[] args) {
        Single s= new Single();
        s.name = "ravi";
        s.marks = 10;
        System.out.println(s.toString());
    }
}
