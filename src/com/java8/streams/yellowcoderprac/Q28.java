package com.java8.streams.yellowcoderprac;

import java.util.*;

public class Q28 {
    public static void main(String[] args) {
//        Q56. Array of numbers, find second highest number from the array ?
        List<Integer> numbersList = Arrays.asList(5, 3, 9, 1, 6, 8, 9);

        numbersList.stream().sorted(Comparator.reverseOrder()).distinct().skip(1).findFirst().ifPresent(System.out::println);


    }
}
