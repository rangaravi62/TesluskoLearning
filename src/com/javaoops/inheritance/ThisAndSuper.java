package com.javaoops.inheritance;

class ThisAndSuper {
    int i =1;
}
class B extends ThisAndSuper{
    int i =2;
    void printIValue(){
        int i =3;
        System.out.println(i);
        System.out.println(this.i); //this refers to current object instance variable
        System.out.println(super.i); //super refers to the parent class instance variable
    }

    public static void main(String[] args) {
        B b = new B();
        b.printIValue();
    }
}
