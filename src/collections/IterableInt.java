package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class IterableInt {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            if (element.equals("B")) {
                iterator.remove(); // Removes "B" from the list
            }
        }

        System.out.println(list); // Output: [A, C]
    }
}