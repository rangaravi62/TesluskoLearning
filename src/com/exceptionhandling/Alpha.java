package com.exceptionhandling;

public class Alpha {
    public void div(int a ,int b){
        int c = a/b;
        System.out.println(c);
    }
}

class beta{
    public static void dummy(){
        try {
            Alpha a = new Alpha();
            a.div(4, 0);
        }catch (Exception e){
            System.out.println("Catched Exception in the caller ");
            System.out.println(e.getMessage());
            System.out.println(e.toString());
        }
    }
}

class gaama{
    public static void main(String[] args) {
        beta.dummy();
    }
}
