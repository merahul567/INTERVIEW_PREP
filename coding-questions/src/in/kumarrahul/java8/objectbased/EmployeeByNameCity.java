package in.kumarrahul.java8.objectbased;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static in.kumarrahul.java8.objectbased.EmployeeData.employeesList;

public class EmployeeByNameCity {
    public static void main (String [] args){
        //Group the Employees by city.
        Map<String, List<Employee>> groupByCity = employeesList.stream().collect(Collectors.groupingBy(Employee::getCity));

        System.out.println(groupByCity);

        //Find all employees who lives in ‘Blore’ city, sort them by their name and print the names of employees.
        List<String> empFromBangalore = employeesList.stream()
                .filter(emp -> emp.getCity() == "Blore")
                .sorted(Comparator.comparing(Employee::getName))
                .map(Employee::getName).collect(Collectors.toList());

        System.out.println(empFromBangalore);

        //Sorting a Stream by age and name fields.
        List<Employee> sortByNameAge = employeesList.stream()
                .sorted(Comparator.comparing(Employee::getAge)
                .thenComparing(Employee::getName))
                .collect(Collectors.toList());

        System.out.println(sortByNameAge);

        //Find the employees whose name start with J.
        List<Employee> nameWithJ = employeesList.stream()
                .filter(emp -> emp.getName().startsWith("J"))
                .collect(Collectors.toList());

        System.out.println(nameWithJ);
    }
}
