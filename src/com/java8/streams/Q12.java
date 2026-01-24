package com.java8.streams;

import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;


public class Q12 {
    public static void main(String[] args) {
//        Q. 'Filter' a list of numbers to only include those 'greater than 10' and then find their 'average' ?

                List<Integer> numbers = Arrays.asList(5, 10, 15, 20, 25);
               Double avg =  numbers.stream().filter(i->i>10).collect(Collectors.averagingInt(Integer::intValue));

//               or

        Double avg2 =  numbers.stream().filter(i->i>10).mapToInt(i->i).average().orElse(0.0);

        System.out.println(avg);
        System.out.println(avg2);
    }
}
