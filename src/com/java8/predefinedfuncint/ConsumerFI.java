package com.java8.predefinedfuncint;

import java.time.LocalDate;
import java.time.Period;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerFI {
    public static void main(String[] args) {
        Consumer<Integer> consumer = i -> System.out.println(i);
        int arr[]={1,2,3,4,5,6};
        for (int x: arr) {
            consumer.accept(x);
        }
    }
}

class biConsumer{
    public static void main(String[] args) {
        BiConsumer<LocalDate,LocalDate> biConsumer = (i,j) -> System.out.println(Period.between(i,j));
        biConsumer.accept(LocalDate.now(),LocalDate.of(1999,8,18));
    }
}
