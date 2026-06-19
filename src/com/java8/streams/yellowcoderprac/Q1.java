package com.java8.streams.yellowcoderprac;


import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Q1 {

    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee(1, "John Doe", 30, "Male", 50000),
                new Employee(2, "Jane Smith", 25, "Female", 20000),
                new Employee(3, "Mike Johnson", 40, "Male", 70000),
                new Employee(4, "Emily Davis", 35, "Female", 30000),
                new Employee(5, "Robert Brown", 50, "Male", 90000)
        );

        // 1. how many male and female employees are there?

        Map<String, Long> genderCount = employees.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
        System.out.println(genderCount);

        // 2. avg salary of male and female employees

        Map<String, Double> avgSalary = employees.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingDouble(Employee::getSalary)));
        System.out.println(avgSalary);

//        Q7. Find Employee with the highest salary from a employee's list ?

        employees.stream().max(Comparator.comparingDouble(Employee::getSalary)).ifPresent(System.out::println);

    }

}


class Employee {
    private int id;
    private String name;
    private int age;
    private String gender;
    private double salary;

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", salary=" + salary +
                '}';
    }

    public Employee(int id, String name, int age, String gender, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public double getSalary() {
        return salary;
    }

    // 1. how many male and female employees are there?

}

