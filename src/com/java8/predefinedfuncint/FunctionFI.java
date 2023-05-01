package com.java8.predefinedfuncint;

import java.util.Arrays;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.stream.IntStream;

public class FunctionFI {
    Function<Integer, Integer> function = i -> i * 5;

    public static void main(String[] args) {
        Function<Integer, Integer> function = i -> i * 5;
        int arr[]={1,2,3,4,5,6};
        for (int x: arr) {
            System.out.println(function.apply(x));
        }

    }
}


class andThenComposeFn{
    public static void main(String[] args) {
        Function<Integer, Integer> function1 = i -> i * 5;
        Function<Integer, Integer> function2 = i -> i * i;
        int arr[]={1,2,3,4,5,6};
        System.out.println("using andThen -> ");
        for (int x: arr) {
            System.out.print(function1.andThen(function2).apply(x) + " ");  //function chaining
        }
        System.out.println();
        System.out.println("using compose -> ");
        for (int x: arr) {
            System.out.print(function1.compose(function2).apply(x) + " ");  // here first function 2 will be applied and after then function1
        }
    }

}


class biFunction{
    public static void main(String[] args) {
        BiFunction<String,String,String> biFunction = (i,j) -> i+j;
        System.out.println(biFunction.apply("Ranga ","Ravi Teja"));

    }
}
