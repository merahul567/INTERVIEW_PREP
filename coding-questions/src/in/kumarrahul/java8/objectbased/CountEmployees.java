package in.kumarrahul.java8.objectbased;

import java.util.Map;
import java.util.stream.Collectors;

import static in.kumarrahul.java8.objectbased.EmployeeData.employeesList;

public class CountEmployees {
    public static void main (String [] args){
        //No of employees in the organisation.
        Long totalEmployee = employeesList.stream().count();

        System.out.println(totalEmployee);

        //Find the count of male and female employees present in the organization.
        Map<String, Long> countByGender = employeesList.stream()
                .collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));

        System.out.println(countByGender);

        //Find the count of male and female present in each department
        Map<String, Map<String, Long>> countByGenderInDept = employeesList.stream()
                .collect(Collectors.groupingBy(Employee::getDeptName,
                        Collectors.groupingBy(Employee::getGender, Collectors.counting())));

        System.out.println(countByGenderInDept);

        //Print the number of employees in each department.
        Map<String, Long> countByDept = employeesList.stream()
                .collect(Collectors.groupingBy(Employee::getDeptName, Collectors.counting()));

        System.out.println(countByDept);

        for(Map.Entry<String, Long> entry : countByDept.entrySet())
        {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

    }
}
