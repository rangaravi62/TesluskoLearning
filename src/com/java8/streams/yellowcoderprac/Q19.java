package com.java8.streams.yellowcoderprac;

import java.util.*;
public class Q19 {
    public static void main(String[] args) {
        //Q48. Filter out null values from a list of strings using streams ?
        List<String> strings = new ArrayList<>();
        strings.add("one");
        strings.add(null);
        strings.add("two");
        strings.add(null);
        strings.add("three");

        strings.stream().filter(str -> str !=null).forEach(System.out::println);
    }
}
