package com.javaoops.inheritance;

class Multilevel {
    String name;
    int marks;
}
class Multi extends Multilevel{
    char grade ;
}
class Multi1 extends Multi{
    public void dispRes(){
        if(marks > 90){
            grade = 'A';
            System.out.println(name +" you have scored "+marks+" marks and secured grade "+grade+" Well done! keep it up!");
        }else {
            grade ='B';
            System.out.println(name +" you have scored "+marks+"marks and secured grade "+grade+" Good Job!");
        }
    }

    public static void main(String[] args) {
        Multi1 m = new Multi1();
        m.name = "ravi";
        m.marks =100;
        m.dispRes();
    }

}
