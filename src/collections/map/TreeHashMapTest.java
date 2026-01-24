package collections.map;

import java.util.Map;
import java.util.TreeMap;

public class TreeHashMapTest {
    public static void main(String[] args) {
            // Creating a TreeMap to store student IDs and their corresponding names
            TreeMap<Integer, String> studentMap = new TreeMap<>();
            // Adding some student records to the TreeMap
            studentMap.put(1003, "Michael Johnson");
            studentMap.put(1001, "John Smith");
            studentMap.put(1002, "Emily Brown");
            // Iterating over the entries of the TreeMap and printing each key-value pair
            System.out.println("Student Records:");
            for (Map.Entry<Integer, String> entry : studentMap.entrySet()) {
                System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
            }
    }
}
