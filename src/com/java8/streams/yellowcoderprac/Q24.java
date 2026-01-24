package com.java8.streams.yellowcoderprac;

import java.util.*;
import java.util.function.Function;

public class Q24 {
    public static void main(String[] args) {
//        Q53. Find the product of all elements in a list of integers ?

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        int prod = numbers.stream().reduce((a,b) -> a*b).get();

        System.out.println(prod);
    }
}
