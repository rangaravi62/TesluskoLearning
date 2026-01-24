package com.java8.streams.yellowcoderprac;

import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Q21 {
    public static void main(String[] args) {
//        Q50. Generate an infinite sequence of random numbers and print the first 10 ?
        Random random = new Random();


        Stream<Integer> randomNums = Stream.generate(random::nextInt).limit(10);
        randomNums.forEach(System.out::println);

    }
}
