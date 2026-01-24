package com.java8.methodreferences;

import java.util.*;
import java.util.Arrays;
import java.util.function.Function;
import java.util.function.Supplier;

public class MethodRef {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Java", "Stream", "Method", "References");
        // Instance Method Reference: Converting all strings to uppercase   --------->   ClassName::methodName
        words.stream().map(String::toUpperCase).forEach(System.out::println);


        // constructor reference   --------------------->   ClassName::new

        Supplier<List<String>> listSupplier = ArrayList::new;
        System.out.println(listSupplier.get()); // Prints an empty ArrayList

        // Static Method Reference --------------------->   ClassName::staticMethodName
        Function<String, Integer> parseInt = Integer::parseInt;
        System.out.println(parseInt.apply("321"));

    }
}
