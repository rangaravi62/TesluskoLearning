package com.enums;

import java.util.Arrays;

public enum Week {
    MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY
}
class TestEnum{
    public static void main(String[] args) {
         Week week = Week.MONDAY;
        System.out.println(week);

        int ordinal = Week.FRIDAY.ordinal();
        System.out.println(ordinal);

        System.out.println(Arrays.toString(Week.values()));
    }
}