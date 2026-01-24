package com.java8.streams.yellowcoderprac;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Q11 {
    public static void main(String[] args) {
//        Q. Group a list of Strings by their length ?
        List<String> strings = List.of("apple", "banana", "cherry");
        Map<Integer, List<String>> map = strings.stream().collect(Collectors.groupingBy(String::length));
        System.out.println(map);
    }
}
