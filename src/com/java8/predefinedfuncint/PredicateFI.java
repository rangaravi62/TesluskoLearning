package com.java8.predefinedfuncint;

import java.util.Arrays;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PredicateFI {
    static Predicate<Integer> predicate = new Predicate<Integer>() {  // using anonymous inner class
        @Override
        public boolean test(Integer n) {
            if (n%2==0){
                return true;
            }else {
                return false;
            }
        }
    };


    Predicate<Float> predicate1 = i -> i > 0;  // using lambda expression

    public static void main(String[] args) {
        System.out.println(predicate.test(10));
    }
}


class StrLen{
    public static void main(String[] args) {
        String str[] ={"ravi","ranga"};

        Predicate<String> predicate2 = st -> st.length() > 3;
        Arrays.stream(str).filter(predicate2).forEach(System.out::println);
    }
}

class AndnOr {
    public static void main(String[] args) {


        Predicate<Integer> predicate1 = i -> i % 2 == 0;
        Predicate<Integer> predicate2 = st -> st > 3;

        Integer x[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (
                int i : x) {
            if (predicate1.and(predicate2).test(i)) {
                System.out.println(i);
            }

        }
    }
}




    class biPredicate{
        public static void main(String[] args) {

            BiPredicate<Integer,Integer> biPredicate = (i1,i2) -> (i1+i2)%2==0;
            System.out.println(biPredicate.test(4,6));

        }
    }




