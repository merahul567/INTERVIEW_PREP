package in.kumarrahul.java8.objectbased;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static in.kumarrahul.java8.objectbased.EmployeeData.employeesList;

public class EmployeeByDepartment {
    public static void main (String [] args){
        //Print the names of all distinct departments in the organization.
        List<String> distinctDept = employeesList.stream().map(Employee::getDeptName).distinct()
                .collect(Collectors.toList());

        System.out.println(distinctDept);

        //Find the department name which has the highest number of employees.
        String deptWithHighestEmp = employeesList.stream()
                .collect(Collectors.groupingBy(Employee::getDeptName, Collectors.counting()))
                .entrySet().stream().max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey).orElse(null);

        System.out.println(deptWithHighestEmp);

        //Find if there any employees from HR Department.
        Employee hrDeptEmployee = employeesList.stream()
                .filter(emp -> emp.getDeptName() == "HR")
                .findAny().orElseThrow();

        System.out.println(hrDeptEmployee);

        //Find the department names that these employees work for, where the number of employees in the department is over 3.
        Map<String, Integer> deptWithOver3Emp = employeesList.stream()
                .collect(Collectors.groupingBy(Employee::getDeptName, Collectors.counting()))
                .entrySet().stream().filter(entry -> entry.getValue() > 3)
                .collect(Collectors.toMap(Map.Entry::getKey, entry -> entry.getValue().intValue()));

        System.out.println(deptWithOver3Emp);
    }
}
