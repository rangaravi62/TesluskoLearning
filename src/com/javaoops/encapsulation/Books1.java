package com.javaoops.encapsulation;

public class Books1 {
    private int pgNo;

    public int getPgNo() {
        return pgNo;
    }

    public void setPgNo(int pgNo) {
        if(!(pgNo < 0)){
            this.pgNo = pgNo;
        }else {
            System.out.println("pgNo cannot be in negative you dumb!");
        }

    }

}


class Test1 {
    public static void main(String[] args) {
        Books1 b =new Books1();
        b.setPgNo(5);
        System.out.println(b.getPgNo());
    }

}


