package StreamsPrac.model;

import java.util.*;
import java.util.stream.Collectors;


public class App {

    static List<Employee> employeeList = new ArrayList<>();

    public static void main(String[] args) throws Exception {

        EmployeeFactory employeeFactory = new EmployeeFactory();
        employeeList = employeeFactory.getAllEmployee();

        // TODO
        // QnA

//       1. List all distinct project in non-ascending order.
        List<Project> projects = employeeList.stream().map(Employee::getProjects)
                .flatMap(List::stream)
                .distinct()
                .sorted((p1, p2) -> p2.getName().compareTo(p1.getName()))
                .collect(Collectors.toList());

//        System.out.println(projects);

        // 2. Print full name of any employee whose firstName starts with ‘A’.

//        employeeList.stream().filter(i->i.getFirstName().startsWith("A")).forEach(j-> System.out.println(j.getFirstName()+" "+j.getLastName()));


//        3. List of all employee who joined in year 2023 (year to be extracted from employee id i.e., 1st 4 characters).


        List<String> emp2023List = employeeList.stream().filter(i-> i.getId().startsWith("2023")).map(j->j.getFirstName()+" "+j.getLastName()).collect(Collectors.toList());
//        System.out.println(emp2023List);

//        4. Sort employees based on firstName, for same firstName sort by salary.


        List<String> empSortListMyLogic = employeeList.stream().sorted((i1, i2) -> {
            if (i1.getFirstName().compareTo(i2.getFirstName()) > 0) return 1;
            else if (i1.getFirstName().compareTo(i2.getFirstName()) < 0) return -1;
            else if (i1.getFirstName().equals(i2.getFirstName())) {
                if (i1.getSalary() > i2.getSalary()) return 1;
                else if (i1.getSalary() < i2.getSalary()) return -1;
                else return 0;
            }else return 0;
        }).map(Employee::getFirstName).collect(Collectors.toList());


        List<Employee> empSortList = employeeList.stream()
                .sorted(Comparator.comparing(Employee::getFirstName)
                        .thenComparing(Employee::getSalary))
                .collect(Collectors.toList());

//        System.out.println(empSortList);


//        5. Print names of all employee with 3rd highest salary. (generalise it for nth highest salary).
            //TODO




//        6. Print min salary.


        Employee minEmp = employeeList.stream().min((i1,i2)-> Integer.toString(i1.getSalary()).compareTo(Integer.toString(i2.getSalary()))).get();

//        System.out.println(minEmp);


//        7. Print list of all employee with min salary.
        //TODO




//         8. List of people working on more than 2 projects.


        List<String> listOfEmpHaving2Proj = employeeList.stream().filter(i->i.getProjects().size() > 2).map(Employee::getFirstName).collect(Collectors.toList());

//        System.out.println(listOfEmpHaving2Proj);


//        9. Count of total laptops assigned to the employees.


        int totalLaptops = employeeList.stream().mapToInt(Employee::getTotalLaptopsAssigned).sum();

//        System.out.println(totalLaptops);


//        10. Count of all projects with Robert Downey Jr as PM.

        int rdjProjects = (int) employeeList.stream().map(i->i.getProjects()).flatMap(j->j.stream()).collect(Collectors.toSet()).stream().filter(k->k.getProjectManager().equals("Robert Downey Jr")).count();
//        System.out.println(rdjProjects);


//        11. List of all projects with Robert Downey Jr as PM.

        List<String> rdjProjectsList =  employeeList.stream().map(i->i.getProjects()).flatMap(j->j.stream()).collect(Collectors.toSet()).stream().filter(k->k.getProjectManager().equals("Robert Downey Jr")).map(Project::getName).collect(Collectors.toList());
        System.out.println(rdjProjectsList);

//        12. List of all people working with Robert Downey Jr.



    }
}
