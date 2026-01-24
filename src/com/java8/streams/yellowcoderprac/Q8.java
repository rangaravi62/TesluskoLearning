package com.java8.streams.yellowcoderprac;

import java.util.List;
import java.util.stream.Collectors;

public class Q8 {
    public static void main(String[] args) {
//        Q. Concatenate a list of strings into a single string, seperated by commas ?

        List<String> strings = List.of("apple", "banana", "cherry");
        String finalString = strings.stream().collect(Collectors.joining(","));
        System.out.println(finalString);

    }
}
