package com.javaoops.inheritance;

public class SuperMethodUsage {
    public SuperMethodUsage() {
        System.out.print("in SuperMethodUsage, ");
    }
    public SuperMethodUsage(int i){
        this();
        System.out.print("in SuperMethodUsage "+i+ ", ");
    }
}

class Test extends SuperMethodUsage{
        public Test(){
            super(5);
            System.out.print("in Test ");
        }
        public Test(int i){
            super(i);
            System.out.print("in Test "+i+" ");
        }

    public static void main(String[] args) {
        Test t = new Test(); //in SuperMethodUsage 5, in Test
        System.out.println();
        Test t1 = new Test(10); //in SuperMethodUsage, in SuperMethodUsage 10, in Test 10
    }
}
