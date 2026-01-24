package collections;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

//Ways to iterate the elements of the collection in Java
//There are various ways to traverse the collection elements:
//
//By Iterator interface.
//By for-each loop.
//By ListIterator interface.
//By for loop.
//        By forEach() method.
//By forEachRemaining() method.

public class TypesOfIteration {
    public static void main(String[] args) {
        List<String> list = List.of("Ranga","Bunty","Neha");
        System.out.println( "Using For Loop : ");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println();

        System.out.println("Using For Each :");
        for (String str : list){
            System.out.println(str);
        }

        System.out.println();

        System.out.println("Using ForEach Method :");
        list.forEach(System.out::println);

        System.out.println();

        System.out.println("Using Iterator :");

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println();

        System.out.println("Using ListIterator :");

        ListIterator<String> listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()){
            System.out.println(listIterator.previous());
        }

        System.out.println();
        System.out.println("Using forEachRemaining of Iterator :");

        Iterator<String> itr = list.iterator();
        itr.forEachRemaining(System.out::println);
    }
}
