package com.java8.streams.yellowcoderprac;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Q2 {
    public static void main(String[] args) {

        //  Find Sum of odd and even numbers in given list ?

        List<Integer> list = List.of(1,2,3,4,5,6,7,8,9,10);
        Map<Boolean, Integer> map = list.stream().collect(Collectors.partitioningBy(i->i%2==0, Collectors.summingInt(Integer::intValue))); //passing intValue because it expects primitive int values, we can use i->i
        System.out.println("odd sum -> "+map.get(false)+" even sum -> "+map.get(true));
    }
}
