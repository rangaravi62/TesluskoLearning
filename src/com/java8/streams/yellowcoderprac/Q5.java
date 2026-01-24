package com.java8.streams.yellowcoderprac;

import java.util.stream.Collectors;

public class Q5 {
    public static void main(String[] args) {
        String str = "Hello, World! $%^";
        System.out.println(findSpecialCharacters(str));
    }

    static String findSpecialCharacters (String str) {
        return str.chars().filter(c -> !Character.isLetterOrDigit(c)).mapToObj(c -> String.valueOf((char)c)).collect(Collectors.joining(" "));
    }
}
