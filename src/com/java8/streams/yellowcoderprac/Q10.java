package com.java8.streams.yellowcoderprac;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Q10 {
    public static void main(String[] args) {
//        Q. Find frequency of characters in a given string ?

        String string = "Rravi Teja";

        Map<Character, Long> map = string.replace(" ","").chars().mapToObj(c -> (char)c).map(Character::toLowerCase).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting()));

        map.entrySet().forEach(i -> System.out.println(i.getKey()+" -> "+i.getValue()));

    }
}
