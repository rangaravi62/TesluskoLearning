package com.dateandtimeapi;

import java.time.*;

public class JodaTimeApi {
    public static void main(String[] args) {

        //LocalDate

        LocalDate localDate = LocalDate.now();
//        System.out.println("localDate : "+localDate); //2023-05-01
        LocalTime localTime = LocalTime.now();
//        System.out.println("localTime : "+localTime);
        int dayOfMonth = localDate.getDayOfMonth();
        int month = localDate.getMonthValue();
        int year = localDate.getYear();
//        System.out.println("day : "+dayOfMonth+", month : "+month+", year : "+year);

        //LocalTime

        int hr = localTime.getHour();
        int min = localTime.getMinute();
        int sec = localTime.getSecond();
        int ns = localTime.getNano();

//        System.out.println("hour : "+hr+", min : "+min+", sec : "+sec+", ns : "+ns);

        //LocalDateTime

        LocalDateTime localDateTime = LocalDateTime.now();
//        System.out.println(localDateTime);

        LocalDateTime dt1 = LocalDateTime.of(1999,8,18,5,50,50);
//        System.out.println(dt1);

        ZoneId zoneId = ZoneId.systemDefault();
//        System.out.println(zoneId);


    }
}
