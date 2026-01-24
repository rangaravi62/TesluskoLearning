package com.java8.streams.yellowcoderprac;

import java.util.*;

public class Q16 {
    public static void main(String[] args) {
        //Q45. Find the first name of the oldest person in a list of Person objects ?
        List<Person> people = Arrays.asList(
                new Person("John", "Doe", 25),
                new Person("Jane", "Smith", 30),
                new Person("Alice", "Johnson", 28));


        String maxAgedPerson = people.stream().max(Comparator.comparing(Person::getAge)).get().getFirstName();
        System.out.println(maxAgedPerson);
    }
}

class Person {

    private String firstName;

    private String lastName;

    private int age;

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }
// Constructor

    public Person(String firstName, String lastName, int age) {

        this.firstName = firstName;

        this.lastName = lastName;

        this.age = age;

    }


    // Getters

    public String getFirstName() {

        return firstName;

    }


    public int getAge() {

        return age;

    }

}
