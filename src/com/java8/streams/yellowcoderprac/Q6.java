package com.java8.streams.yellowcoderprac;

import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Q6 {
    public static void main(String[] args) {
        //Q. Find out numbers starting with 1 ?

        List<Integer> numbers = Arrays.asList(123, 456, 101, 789, 120, 132, 204);
        numbers.stream().map(i->i+"").filter(i->i.startsWith("1")).forEach(System.out::println);

        numbers.stream().filter(num -> Integer.toString(num).startsWith("1")).forEach(System.out::println);

        List<Integer> list = numbers.stream().map(String::valueOf).filter(i->i.startsWith("1")).map(Integer::parseInt).collect(Collectors.toList());
        System.out.println(list);

    }
}
