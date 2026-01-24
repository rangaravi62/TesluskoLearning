package com.java8.streams.yellowcoderprac;

import java.io.CharConversionException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Q9 {
    public static void main(String[] args) {
//        Q. Find the first non-repeating character in a string ?

        String string = "Rravi Teja";

        Map<Character, Long> map = string.replace(" ","").chars().mapToObj(c -> (char)c).map(Character::toLowerCase).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting()));

        map.entrySet().stream().filter(i->i.getValue() == 1).findFirst().ifPresent(i->System.out.println(i.getKey()));
    }
}
