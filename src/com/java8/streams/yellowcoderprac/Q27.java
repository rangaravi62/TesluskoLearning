package com.java8.streams.yellowcoderprac;

import java.util.Comparator;
import java.util.List;
import java.util.Arrays;


public class Q27 {
    public static void main(String[] args) {
//        Q55. List of employees , having properties id , name , salary . List Top three highest paid employees ?

        List<Employee1> employees = Arrays.asList(
                new Employee1(1, "Alice", 70000),
                new Employee1(2, "Bob", 85000),
                new Employee1(3, "Charlie", 60000),
                new Employee1(4, "David", 95000),
                new Employee1(5, "Eve", 120000)
        );

        employees.stream().sorted((a,b) -> a.getSalary() < b.getSalary() ? 1 : -1).limit(3).forEach(System.out::println);

        employees.stream().sorted((a,b) -> Double.compare(b.getSalary(),a.getSalary())).limit(3).forEach(System.out::println);



    }
}


class Employee1 {

    private int id;

    private String name;

    private double salary;


    public Employee1(int id, String name, double salary) {

        this.id = id;

        this.name = name;

        this.salary = salary;

    }


    public int getId() {

        return id;

    }


    public String getName() {

        return name;

    }


    public double getSalary() {

        return salary;

    }


    @Override

    public String toString() {

        return "Employee{" +

                "id=" + id +

                ", name='" + name + '\'' +

                ", salary=" + salary +

                '}';

    }

}
