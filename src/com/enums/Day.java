package com.enums;

public enum Day {
    MONDAY("Start of week"),
    TUESDAY("Work day"),
    WEDNESDAY("Mid week"),
    THURSDAY("Work day"),
    FRIDAY("Almost weekend"),
    SATURDAY("Weekend"),
    SUNDAY("Weekend");

    private String description;

    // Constructor (implicitly private)
    Day(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}


class dayTest {
    public static void main(String[] args) {
        System.out.println(Day.MONDAY.getDescription());
    }
}
