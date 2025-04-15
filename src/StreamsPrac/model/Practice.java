package StreamsPrac.model;

import java.util.List;

public class Practice {
    public static void main(String[] args) {

//        1.List all distinct project in non-ascending order.

        EmployeeFactory employeeFactory = new EmployeeFactory();
        List<Employee> employeeList = employeeFactory.getAllEmployee();
//        employeeList.stream().map(Employee::getProjects).flatMap()




        // 2. Print full name of any employee whose firstName starts with ‘A’.

        employeeList.stream().filter(a -> a.getFirstName().startsWith("A")).forEach(b -> System.out.println(b.getFirstName() +" "+b.getLastName()));

    }
}
