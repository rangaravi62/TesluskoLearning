package collections.set;

import java.util.HashSet;
import java.util.Iterator;

class Person {
    private String name;
    private int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && name.equals(person.name);
    }
    @Override
    public int hashCode() {
        return name.hashCode() + age;
    }
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
public class HashSetTest {
    public static void main(String[] args) {
        // Create a HashSet  
        HashSet<String> hashSet = new HashSet<>();
        // Add elements to the HashSet  
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Orange");
        // Display the HashSet  
        System.out.println("HashSet: " + hashSet);
        // Iterate over the HashSet using an Iterator  
        System.out.print("Iterating over the HashSet using Iterator: ");
        Iterator<String> iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.print(element + " ");
        }
        System.out.println();
        // Convert HashSet to an array  
        String[] array = hashSet.toArray(new String[0]);
        System.out.print("HashSet converted to array: ");
        for (String element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
        // Create a HashSet of custom objects  
        HashSet<Person> personSet = new HashSet<>();
        personSet.add(new Person("Alice", 30));
        personSet.add(new Person("Bob", 25));
        // Display the HashSet of custom objects  
        System.out.println("HashSet of custom objects: " + personSet);
    }
}  