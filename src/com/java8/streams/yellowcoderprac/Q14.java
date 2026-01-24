package com.java8.streams.yellowcoderprac;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Q14 {
    public static void main(String[] args) {
//        Q. Flatten a list of lists of integers into a single list of integers ?
        List<List<Integer>> listOfLists = Arrays.asList(Arrays.asList(1, 2, 3), Arrays.asList(4, 5), Arrays.asList(6, 7, 8, 9));
        List<Integer> list = listOfLists.stream().flatMap(Collection::stream).collect(Collectors.toList());
        System.out.println(list);
    }
}
