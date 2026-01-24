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
    // In Java, all constructors in an enum are implicitly private, even if you do not explicitly declare them as private.
    // This is because enum types are designed to have a fixed set of constants, and the private constructor ensures that no
    // additional instances of the enum can be created outside of the enum definition.
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
