package CoreJava.java8.streams.yellowcoderprac;


import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Q32 {
    static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        Stream<Integer> stream = numbers.stream()
                .filter(i -> {
                    System.out.println("filter: " + i);
                    return i % 2 == 0;
                })
                .map(i -> {
                    System.out.println("map: " + i);
                    return i * 10;
                });

        System.out.println("Before terminal operation");

        List<Integer> result = stream.collect(Collectors.toList());

        System.out.println(result);

//        Before terminal operation
//        filter: 1
//        filter: 2
//        map: 2
//        filter: 3
//        filter: 4
//        map: 4
//        filter: 5
//        [20, 40]
//
//        Lazy evaluation: nothing inside filter() or map() executes until collect() is called.
//        Pipeline execution: for each element, Java pushes it through the applicable operations before moving to the next element.

    }
}
