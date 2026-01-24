package com.java8.streams.yellowcoderprac;

import java.util.*;
import java.util.stream.Stream;

public class Q25 {
    public static void main(String[] args) {
//        Q54. Merge two lists of integers and remove duplicates ?

        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> list2 = Arrays.asList(4, 5, 6, 7, 8);

        Stream.concat(list1.stream(),list2.stream()).distinct().forEach(System.out::println);

    }
}
