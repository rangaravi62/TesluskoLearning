package collections.list;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        // Create an ArrayList
        ArrayList<String> list = new ArrayList<>();

        // Add elements to the ArrayList
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        // Print the ArrayList
        System.out.println("ArrayList: " + list);

        // Access an element
        String firstElement = list.get(0);
        System.out.println("First element: " + firstElement);

        // Remove an element
        list.remove("Banana");
        System.out.println("After removing Banana: " + list);

        // Get the size of the ArrayList
        int size = list.size();
        System.out.println("Size of ArrayList: " + size);
    }
}
