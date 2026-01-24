package com.java8.streams.yellowcoderprac;

import java.util.List;
import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Q13 {
    public static void main(String[] args) {
//        Q. Convert a list of strings to 'map' where key is 'string' and value is 'length' ?

        List<String> strings = Arrays.asList("apple", "banana", "orange", "grape", "kiwi");
        strings.stream().collect(Collectors.toMap(Function.identity(),String::length)).forEach((str, len ) -> System.out.println(str+" ---> "+len));




    }
}
