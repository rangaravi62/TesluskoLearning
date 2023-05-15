package com.exceptionhandling;

public class RuntimeError {
    public static void main(String[] args) {
//        disp(); // stack overflow error
    }
    public static void  disp(){
        disp();
    }
}
