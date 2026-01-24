package com.java8.streams.yellowcoderprac;

import java.util.*;

public class Q22 {
    public static void main(String[] args) {
//        Q51. Find the sum of the squares of a list of integers ?
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        int sum = numbers.stream().mapToInt(i->i*i).sum();
        System.out.println(sum);

    }
}
