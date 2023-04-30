package com.dateandtimeapi;

import java.time.LocalDate;
import java.time.Period;
import java.time.Year;

public class calAge {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();
        LocalDate birthday = LocalDate.of(1999,8,18);

        // Period -> to check diff between two dates

        Period p = Period.between(birthday,currentDate);
        System.out.println(p);
        System.out.println("your age is : "+p.getYears()+" years,"+p.getMonths()+" months and "+p.getDays()+" days");

        Year year = Year.now();
        System.out.println(year.isLeap());
    }
}
