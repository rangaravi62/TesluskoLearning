package collections.map;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapTest {
    public static void main(String[] args) {
        // Creating a LinkedHashMap to store student IDs and their corresponding names
        Map<Integer, String> studentMap = new LinkedHashMap<>();
        // Adding some student records to the LinkedHashMap
        studentMap.put(1001, "John Smith");
        studentMap.put(1002, "Emily Brown");
        studentMap.put(1003, "Michael Johnson");
        // Iterating over the entries of the LinkedHashMap and printing each key-value pair
        System.out.println("Student Records:");
        for (Map.Entry<Integer, String> entry : studentMap.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
        }
    }
}
