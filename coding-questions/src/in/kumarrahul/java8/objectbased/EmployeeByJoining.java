package in.kumarrahul.java8.objectbased;

import java.util.Comparator;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import static in.kumarrahul.java8.objectbased.EmployeeData.employeesList;

public class EmployeeByJoining {
    public static void main (String [] args){
        //Find longest serving employees in the organization.
        Employee longestServing = employeesList.stream()
                        .sorted(Comparator.comparingInt(Employee::getYearOfJoining))
                        .findFirst().orElseThrow();

        System.out.println(longestServing);

        //Find longest serving employee in each department
        Map<String, Employee> longestServingByDept = employeesList.stream().collect(Collectors
                .groupingBy(Employee::getDeptName, Collectors.collectingAndThen(
                Collectors.minBy(Comparator.comparing(Employee::getYearOfJoining)), Optional::get)));

        System.out.println(longestServingByDept);

    }
}
