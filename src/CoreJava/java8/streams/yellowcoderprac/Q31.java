package CoreJava.java8.streams.yellowcoderprac;

import java.util.Comparator;
import java.util.List;
import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

//most frequently occurring word
public class Q31 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList(
                "apple", "banana", "apple", "orange",
                "banana", "apple", "grape"
        );

        String word = words.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet().stream().
                max(Comparator.comparingLong(entry -> entry.getValue())).get().getKey();

        System.out.println(word);
    }
}
