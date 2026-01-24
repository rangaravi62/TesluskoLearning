package com.java8.streams.yellowcoderprac;

import java.util.*;

public class Q26 {
    public static void main(String[] args) {
//        Q55. Check if any string in a list starts with a specific prefix ?

        List<String> strings = Arrays.asList("apple", "banana", "cherry", "date");
        String prefix = "b";
        strings.stream().filter(str -> str.startsWith(prefix)).forEach(System.out::println);

        System.out.println(strings.stream().anyMatch(str->str.startsWith(prefix)));

    }
}
