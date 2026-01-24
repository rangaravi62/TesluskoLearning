package com.java8.streams.yellowcoderprac;

import java.util.*;
import java.util.stream.Collectors;

public class Q17 {
    public static void main(String[] args) {
//        Q46. Skip the first 5 elements in a list and then print the rest ?

        List<String> items = Arrays.asList("one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten");

        items.stream().skip(5).forEach(System.out::println);
    }
}
