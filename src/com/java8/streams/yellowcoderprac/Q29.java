package com.java8.streams.yellowcoderprac;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Q29 {
    public static void main(String[] args) {
//        Q57. How to sort a map by its values using streams api ?

        Map<String, Integer> map =  Map.of(
                "Python", 95,
                "JavaScript", 89,
                "C++", 92,
                "TypeScript", 85,
                "Swift", 80);

        Map<String , Integer> sortedmap = map.entrySet().stream().sorted((i,j)-> i.getValue()>j.getValue() ? 1 : -1).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1,e2)-> e2, LinkedHashMap::new));

        System.out.println(sortedmap);
    }
}
