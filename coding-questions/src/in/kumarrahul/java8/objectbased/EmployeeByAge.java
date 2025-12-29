package in.kumarrahul.java8.objectbased;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import static in.kumarrahul.java8.objectbased.EmployeeData.employeesList;

public class EmployeeByAge {
    public static void main (String [] args) {
        //Group the Employees by age.
        Map<Integer, List<Employee>> groupByAge = employeesList.stream().collect(Collectors.groupingBy(Employee::getAge));

        System.out.println(groupByAge);

        //Print Average age of Male and Female Employees in the organisation.
        Map<String, Double> averageByGender = employeesList.stream()
                .collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge)));

        System.out.println(averageByGender);

        //Print Average age of Male and Female Employees in each department.
        Map<String, Map<String, Double>> averageByGenderDept = employeesList.stream()
                .collect(Collectors.groupingBy(Employee::getDeptName, Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge))));

        System.out.println(averageByGenderDept);

        employeesList.stream()
                .collect(Collectors.groupingBy(Employee::getDeptName,
                        Collectors.groupingBy(Employee::getGender,
                                Collectors.averagingInt(Employee::getAge))))
                .forEach((dept, genderMap) -> genderMap.forEach((gender, avgAge) ->
                        System.out.println(dept + " - " + gender + ": " + avgAge)));

        //Print employee details whose age is greater than 28 in the organisation.
        List<Employee> empByAgeGreater = employeesList.stream().filter(emp -> emp.getAge() > 28).collect(Collectors.toList());

        System.out.println(empByAgeGreater);

        //Find maximum age/oldest of employee in the organisation.
        Employee oldestEmployee = employeesList.stream().max(Comparator.comparingInt(Employee::getAge))
                .orElseThrow();

        System.out.println(oldestEmployee);

        //Find youngest female employee in the organisation.
        Employee youngestFemale = employeesList.stream().filter(emp -> emp.getGender() == "F")
                .min(Comparator.comparingInt(Employee::getAge))
                .orElseThrow();

        System.out.println(youngestFemale);

        //Find the youngest employee in each department
        Map<String, Employee> youngestInEach = employeesList.stream()
                .collect(Collectors.groupingBy(Employee::getDeptName, Collectors.collectingAndThen(Collectors.minBy(Comparator.comparingInt(Employee::getAge)),
                        Optional::get)));

        System.out.println(youngestInEach);

        //Find employees whose age is greater than 30 and less than 30.
        Map<Boolean, List<Employee>> greaterLess30 = employeesList.stream()
                .collect(Collectors.partitioningBy(emp -> emp.getAge() > 30));

        System.out.println(greaterLess30);

        for (Map.Entry<Boolean, List<Employee>> entry : greaterLess30.entrySet()) {
            if (entry.getKey()) {
                System.out.println("Employees with age greater than 30: " + entry.getValue());
            } else {
                System.out.println("Employees with age less than or equal to 30: " + entry.getValue());
            }
        }

        //Find list of employees whose age is less than 30 in Department HR
        List<Employee> ageLessThan30InHr = employeesList.stream()
                .filter(emp -> emp.getDeptName() == "HR" && emp.getAge() < 30)
                .collect(Collectors.toList());

        System.out.println(ageLessThan30InHr);
    }
}
