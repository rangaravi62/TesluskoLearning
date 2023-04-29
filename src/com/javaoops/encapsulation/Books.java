package com.javaoops.encapsulation;

import java.awt.print.Book;

public class Books {
    int pgNo; // here there is no protection for the data any class can access Books class, the Books class written by the dev assuming that pgNo won't be negative
    // but the other devs uses this class and can give -ve values ,

    public void dispPgNo(){
        System.out.println(this.pgNo);
    }
}

 class Test {
    public static void main(String[] args){
        Books b = new Books();
        b.pgNo = -100 ;
        b.dispPgNo();
    }
}


