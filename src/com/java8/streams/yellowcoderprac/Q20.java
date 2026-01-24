package com.java8.streams.yellowcoderprac;

import java.util.*;
import java.util.stream.Collectors;

public class Q20 {
    public static void main(String[] args) {
        //Q49. Partition a list of integers into even and odd numbers ?

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        Map<Boolean, List<Integer>> booleanListMap =  numbers.stream().collect(Collectors.partitioningBy(i -> (i&1) == 0));
        System.out.println(booleanListMap);
    }
}
