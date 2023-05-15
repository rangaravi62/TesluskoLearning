package com.exceptionhandling;

import java.sql.SQLException;

public class Exc1 {
    public static void main(String[] args)  {
        try {
            System.out.println("output -> "+Exc12.dummy());
        }catch (Exception e){
//            e.printStackTrace();

        }

        }


}

class Exc11{
    public static int div(int a,int b)  {
        int c = 0;
        try {
             c = a / b;
        }catch (Exception e){
//            e.printStackTrace();
            throw e;
        }
        
        return c;
        
    }

}


class Exc12{
    public static int dummy(){
        int res= Exc11.div(4,0);
        return res;
    }

}
