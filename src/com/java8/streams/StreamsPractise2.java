package com.java8.streams;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsPractise2 {
    public static void main(String[] args) {


//        --------------------------------------------------------------------------------------------------------------
//                https://blog.devgenius.io/java-8-coding-and-programming-interview-questions-and-answers-62512c44f062
//        --------------------------------------------------------------------------------------------------------------

        
// ----> 1. Given a list of integers, find out all the even numbers that exist in the list using Stream functions?

//        List<Integer> list = List.of(1,2,3,4,5,6,7,8,9,10);
//        list.stream().filter(i -> (i&1)==0).forEach(System.out::println);


// ----> 2. Given a list of integers, find out all the numbers starting with 1 using Stream functions?

//         List<Integer> list = List.of(1,12,3,4,155,6,147,8,9,10);
//         list.stream().map(i -> i+"").filter(s->s.startsWith("1")).map(Integer::parseInt).forEach(System.out::println);

// ---->  3. How to find duplicate elements in a given integers list in java using Stream functions?


//        List<Integer> list = List.of(1,12,33,4,155,33,147,8,9,10);
//        Set<Integer> set = new HashSet<>();
//        list.stream().filter(i-> !set.add(i)).forEach(System.out::println);

//        4.Given the list of integers, find the first element of the list using Stream functions?

//                List<Integer> list = List.of(1,12,33,4,155,33,147,8,9,10);
//        list.stream().findFirst().ifPresent(System.out::println);

//        5. Given a list of integers, find the total number of elements present in the list using Stream functions?

//           List<Integer> list = List.of(1,12,33,4,155,33,147,8,9,10);
//        System.out.println(list.stream().count());

//        6. Given a list of integers, find the maximum value element present in it using Stream functions?

//           List<Integer> list = List.of(1,12,33,4,155,33,147,8,9,10);
//           list.stream().max(Comparator.naturalOrder()).ifPresent(System.out::println);
//        list.stream().max(Integer::compare).ifPresent(System.out::println);

//        7.  Given a String, find the first non-repeated character in it using Stream functions?

//            String str = "aaaaa";

            // map ->  map  for transforming within the same primitive type (e.g., int to int).

            // mapToObj -> mapToObj is for converting from a primitive type (like int) to an object (like Character, String, or any other class).

//        Character character = str.chars().mapToObj(c -> (char)c).map(Character::toLowerCase).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting()))
//                    .entrySet().stream().filter(entry -> entry.getValue() == 1L).map(Map.Entry::getKey).findFirst().orElse(null);
//
//
//        System.out.println(character);



//        8.   Given a String, find the first repeated character in it using Stream functions?


//        String str = "Rranga";
//
//        Character character = str.chars().mapToObj(c -> (char)c).map(Character::toLowerCase).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting()))
//                .entrySet().stream().filter(entry -> entry.getValue() > 1L).map(entry -> entry.getKey()).findFirst().orElse(null);
//
//        System.out.println(character);


//        9.  Given a list of integers, sort all the values present in it using Stream functions?

//        The boxed() method is used in Java streams to convert a stream of primitive type (like IntStream, LongStream, or DoubleStream)
//        into a stream of their corresponding wrapper objects (Stream<Integer>, Stream<Long>, or Stream<Double>, respectively).



//        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
//        System.out.println(myList.stream().sorted().collect(Collectors.toList()));


//        10.  Given a list of integers, sort all the values present in it in descending order using Stream functions?


//            List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
//
//            System.out.println(myList.stream().sorted((i,j) -> i<j ? 1 : -1).collect(Collectors.toList()));
//        System.out.println(myList.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList()));


//        11. Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.


//        Integer[] nums = new Integer[]{1,2,3,1};

//        Set<Integer> set = new HashSet<>();
//        Arrays.stream(nums).map(num -> set.add(num));
//
//        if (nums.length == set.size()) System.out.println(false);
//        else System.out.println(true);

//        or


//        System.out.println(Arrays.stream(nums).anyMatch(num -> !set.add(num)));


//        12. How will you get the current date and time using Java 8 Date and Time API?


//        System.out.println(LocalDate.now());
//        System.out.println(LocalTime.now());


//        13. Write a Java 8 program to concatenate two Streams?



//        List<String> list1 = Arrays.asList("Java", "8");
//        List<String> list2 = Arrays.asList("explained", "through", "programs");
//
//        Stream.concat(list1.stream(),list2.stream());



//        14. Java 8 program to perform cube on list elements and filter numbers greater than 50.

//        List<Integer> integerList = Arrays.asList(4,5,6,7,1,2,3);
//
//        integerList.stream().map(i-> i*i*i).filter(i->i>50).forEach(System.out::println);



//        15. Write a Java 8 program to sort an array and then convert the sorted array into Stream?


//        int arr[] = { 99, 55, 203, 99, 4, 91 };
//
//        Arrays.sort(arr);
//        Arrays.stream(arr);


//        18. How to count each element/word from the String ArrayList in Java8?

        List<String> names = Arrays.asList("AA", "BB", "AA", "CC");

        Map<String , Long> map = names.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(map);









    }
}
