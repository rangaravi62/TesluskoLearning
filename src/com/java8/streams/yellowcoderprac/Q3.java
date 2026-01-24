package com.java8.streams.yellowcoderprac;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Q3 {
    public static void main(String[] args) {
        // Q. Find duplicate elements in a integers list ?
        List<Integer> list = List.of(22,44,35,76,43,44,93,93);

        //using set
        Set<Integer> set = new HashSet<>();
        list.stream().filter(i-> !set.add(i)).forEach(System.out::println);
        System.out.println(set);

        //using groupingBy

        List<Integer> dupList = list.stream().collect(Collectors.groupingBy(Function.identity(), HashMap::new,Collectors.counting())).entrySet()
                .stream().filter(i -> i.getValue() > 1).map(i -> i.getKey()).collect(Collectors.toList());
        System.out.println(dupList);
    }
}
