package com.java8.streams.yellowcoderprac;

import java.util.stream.Collectors;

public class Q4 {
    public static void main(String[] args) {
        // Q. Remove all occurances of a given character from a string ?

        String str = "Ranga Ravi Teja";
        System.out.println(removeAllOccurances(str,'a'));

    }

    //mapToObj converts the IntStream of character codes into a Stream<String>
    static String removeAllOccurances(String str, char ch) {
        return str.chars().filter(c -> c != ch).mapToObj(i-> String.valueOf((char)i)).collect(Collectors.joining());
    }
}
