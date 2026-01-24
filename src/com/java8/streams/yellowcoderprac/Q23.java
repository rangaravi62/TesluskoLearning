package com.java8.streams.yellowcoderprac;

import java.util.*;
import java.util.stream.Collectors;

public class Q23 {
    public static void main(String[] args) {
//        Q52. Convert a list of strings to a list of their respective length using streams ?
        List<String> strings = Arrays.asList("apple", "banana", "cherry", "date");
        System.out.println(strings.stream().map(i->i.length()).collect(Collectors.toList()));


    }
}
