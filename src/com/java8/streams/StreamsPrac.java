package com.java8.streams;

import java.util.*;
import java.util.stream.Collectors;


public class StreamsPrac {
    //Q1 Given a list of integers, find out all the even numbers exist in the list using Stream functions?
//    public static void main(String[] args) {
//        List<Integer> list = Arrays.asList(22,44,22,55,74,86,23,12,46,13,45);
//        List<Integer> evenNumList= list.parallelStream().filter(i -> i%2==0).collect(Collectors.toList());
//        System.out.println(evenNumList);
//    }

//    Q2 Given a list of integers, find out all the numbers starting with 1 using Stream functions?
//public static void main(String[] args) {
//        List<Integer> list = Arrays.asList(22,44,22,55,74,86,23,12,46,13,45);
//        List<Integer> NumWith1List= list.parallelStream().map(i -> i+"").filter(i->i.startsWith("1")).map(Integer::parseInt).collect(Collectors.toList());
//        System.out.println(evenNumList);
//
//}

//    Q3 How to find duplicate elements in a given integers list in java using Stream functions?
//    public static void main(String[] args) {
//
//        List<Integer> list = Arrays.asList(22,44,22,55,74,86,23,12,46,13,45);
//        Set<Integer> notDupNumList = new HashSet<>();
//        List<Integer> dupNumList = list.parallelStream().filter(i->!notDupNumList.add(i)). collect(Collectors.toList());
//        System.out.println(dupNumList);
//
//    }

//    Q4 Given the list of integers, find the first num of integers of the list using Stream functions?

//    public static void main(String[] args) {
//
//        List<Integer> list = Arrays.asList(22,44,22,55,74,86,23,12,46,13,45);
//        List<Integer> NumWith1List= list.parallelStream().map(i -> i+"").map(i->i.substring(0,1)).map(Integer::parseInt).collect(Collectors.toList());
//        System.out.println(NumWith1List);
//
//
//    }


//    Q5 Given the list of integers, find the first element of the list using Stream functions?


//    public static void main(String[] args) {
//
//        List<Integer> list = Arrays.asList(22,44,22,55,74,86,23,12,46,13,45);
//        list.parallelStream().findFirst().ifPresent((i) -> System.out.println(i));
//    }



//    Q5 Given a list of integers, find the total number of elements present in the list using Stream functions?

//    public static void main(String[] args) {
//
//        List<Integer> list = Arrays.asList(22,44,22,55,74,86,23,12,46,13,45);
//        Long totalEle=list.parallelStream().count();
//        System.out.println(totalEle);
//
//    }

//    Q6 Given a list of integers, find the maximum value element present in it using Stream functions?
//didn't understand
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(22,44,22,55,74,86,23,12,46,13,45);
        Integer totalEle= list.parallelStream().max(Integer::compare).get();
        System.out.println(totalEle);

    }


}
