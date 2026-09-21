package CoreJava.java8.streams.yellowcoderprac;

import java.util.*;
import java.util.stream.Collectors;

//1)Find the highest-paid employee in each department.
//2)Employee list where
// key   = department
//value = list of employee names in that department
public class Q30 {

    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee(1, "John Doe", 30, "Male", 50000,"IT"),
                new Employee(2, "Jane Smith", 25, "Female", 20000,"HR"),
                new Employee(3, "Mike Johnson", 40, "Male", 70000,"IT"),
                new Employee(4, "Emily Davis", 35, "Female", 30000,"HR"),
                new Employee(5, "Robert Brown", 50, "Male", 90000,"FINANCE")
        );


        Map<String, String> map = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)),emp -> emp.get().getName())));
        System.out.println(map);

        Map<String,List<String>> emp = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.mapping(Employee::getName,Collectors.toList())));
        System.out.println(emp);

    }

}
