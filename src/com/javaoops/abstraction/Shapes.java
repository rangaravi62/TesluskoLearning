package com.javaoops.abstraction;

import java.util.Scanner;

abstract class Shapes {
    float area;
    abstract void input();
    abstract void compute();
    void display(){
        System.out.println("Area is : "+area);
    }
}

class Rectangle extends Shapes{
    float len;
    float br;
    Scanner sc = new Scanner(System.in);
    void input(){
        System.out.print("Enter the rectangle length : ");
        len = sc.nextFloat();
        System.out.print("Enter the rectangle breadth : ");
        br = sc.nextFloat();
    }

    @Override
    void compute() {
        area = len * br;
    }
}

class Circle extends Shapes{
    float r;
    Scanner sc = new Scanner(System.in);
    void input(){
        System.out.print("Enter the Circle radius : ");
        r = sc.nextFloat();

    }

    @Override
    void compute() {
        area = 3.14f * r * r;
    }
}

class Square extends Shapes{
    float len;
    Scanner sc = new Scanner(System.in);
    void input(){
        System.out.print("Enter the Square length : ");
        len = sc.nextFloat();

    }

    @Override
    void compute() {
        area = len * len;
    }
}

class Geometry{
    void permit(Shapes s){
        s.input();
        s.compute();
        s.display();
    }
}
class Test {
    public static void main(String[] args) {
//        Rectangle rec = new Rectangle();
//        rec.input();
//        rec.compute();
//        rec.display();

//        Circle rec = new Circle();
//        rec.input();
//        rec.compute();
//        rec.display();
//
//        Square rec = new Square();
//        rec.input();
//        rec.compute();
//        rec.display();

        Geometry g = new Geometry();
        g.permit(new Rectangle());
        g.permit(new Square());
        g.permit(new Circle());


    }

}