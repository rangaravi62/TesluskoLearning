package com.dateandtimeapi;

import java.util.Date;

public class utilAndSqlDate {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);//Mon May 01 01:45:08 IST 2023
        long hours = date.getHours();
        System.out.println(hours);
        long time = date.getTime();
        System.out.println(time);


//        ----------------------
        java.sql.Date sqlDate = new java.sql.Date(time);
        System.out.println(sqlDate);


    }
}
