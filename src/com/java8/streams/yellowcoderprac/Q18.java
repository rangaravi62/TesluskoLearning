package com.java8.streams.yellowcoderprac;

import java.util.*;
import java.util.stream.Collectors;

public class Q18 {
    public static void main(String[] args) {
//        Q47. Collect all unique words from a list of sentences ?

        List<String> sentences = Arrays.asList("Java 8 introduced streams", "Streams are powerful", "Use streams to process data");
        Set<String> set = sentences.stream().map(str -> str.split(" ")).flatMap(i-> Arrays.stream(i)).map(String::toLowerCase).collect(Collectors.toSet());
        System.out.println(set);
    }
}
