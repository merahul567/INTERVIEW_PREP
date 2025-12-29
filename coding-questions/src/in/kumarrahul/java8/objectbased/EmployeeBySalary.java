package in.kumarrahul.java8.objectbased;

import java.util.*;
import java.util.stream.Collectors;

import static in.kumarrahul.java8.objectbased.EmployeeData.employeesList;

public class EmployeeBySalary {
    public static void main (String [] args){
        //Find Highest salary in the organisation.
        double highestSalary = employeesList.stream()
                        .collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)))
                        .map(Employee::getSalary)
                        .orElse(0L);

        System.out.println(highestSalary);

        //Find lowest paid salary in the organisation
        double lowestSalary = employeesList.stream()
                .collect(Collectors.minBy(Comparator.comparingDouble(Employee::getSalary)))
                .map(Employee::getSalary)
                .orElse(0L);

        System.out.println(lowestSalary);

        //Find Second Highest salary in the organisation.
        double secondHighestSalary = employeesList.stream()
                        .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
                        .map(Employee::getSalary)
                        .skip(1).findFirst().orElseThrow();

        System.out.println(secondHighestSalary);

        //Nth Highest salary.
        int n = 3;
        double nthHighestSalary = employeesList.stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
                .map(Employee::getSalary)
                .skip(n-1).findFirst().orElseThrow();

        System.out.println(nthHighestSalary);

        //Print the top 3 highest salary earned employees in the organisation
        List<Employee> top3PaidEmp = employeesList.stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
                .limit(3).collect(Collectors.toList());

        System.out.println(top3PaidEmp);

        //Print the top 2 highest salary earned employees in each department
        Map<String, List<Employee>> top2PaidByDept = employeesList.stream()
                        .collect(Collectors.groupingBy(Employee::getDeptName,
                        Collectors.collectingAndThen(Collectors.toList(), l -> l.stream()
                                .sorted(Comparator.comparingLong(Employee::getSalary).reversed())
                                .limit(2)
                                .collect(Collectors.toList()))));

        System.out.println(top2PaidByDept);

        //List of employee’s second highest record based on department
        Map<String, Employee> secondPaidByDept = employeesList.stream()
                .collect(Collectors.groupingBy(Employee::getDeptName,
                        Collectors.collectingAndThen(Collectors.toList(), l -> l.stream()
                                .sorted(Comparator.comparingLong(Employee::getSalary).reversed())
                                .skip(1)
                                .findFirst().get())));

        System.out.println(secondPaidByDept);

        //Find highest paid salary in the organisation based on gender.
        Map<String, Long> highestGenderSalary = employeesList.stream()
                .collect(Collectors.groupingBy(Employee::getGender,
                Collectors.collectingAndThen(
                Collectors.maxBy(Comparator.comparingLong(Employee::getSalary)),
                        opt -> opt.get().getSalary())));

        System.out.println(highestGenderSalary);

        //Highest salary based on department.
        Map<String, Long> highestDeptSalary = employeesList.stream()
                .collect(Collectors.groupingBy(Employee::getDeptName,
                        Collectors.collectingAndThen(
                                Collectors.maxBy(Comparator.comparingLong(Employee::getSalary)),
                                opt -> opt.get().getSalary())));

        System.out.println(highestDeptSalary);

        //Lowest paid based in each department
        Map<String, Long> lowestDeptSalary = employeesList.stream()
                .collect(Collectors.groupingBy(Employee::getDeptName,
                        Collectors.collectingAndThen(
                                Collectors.minBy(Comparator.comparingLong(Employee::getSalary)),
                                opt -> opt.get().getSalary())));

        System.out.println(lowestDeptSalary);

        //Print average and total salary of the organization.
        Double averageSalary = employeesList.stream()
                .collect(Collectors.averagingDouble(Employee::getSalary));

        System.out.println(averageSalary);

        DoubleSummaryStatistics empSalary = employeesList.stream()
                .collect(Collectors.summarizingDouble(Employee::getSalary));

        System.out.println("Total Salary: " + empSalary.getSum());
        System.out.println("Average Salary: " + empSalary.getAverage());

        //Print Average salary by gender in each department .
        Map<String, Map<String, Double>> averageSalByGenderDept = employeesList.stream()
                .collect(Collectors.groupingBy(Employee::getDeptName, Collectors.groupingBy(Employee::getGender, Collectors.averagingDouble(Employee::getSalary))));

        System.out.println(averageSalByGenderDept);

        // Find lowest paid salary in each department based on the gender.
        Map<String, Map<String, Long>> lowestSalByGenderDept = employeesList.stream()
                .collect(Collectors.groupingBy(Employee::getDeptName, Collectors.groupingBy(Employee::getGender,
                        Collectors.collectingAndThen(Collectors.minBy(Comparator.comparingLong(Employee::getSalary))
                        ,opt -> opt.get().getSalary()))));

        System.out.println(lowestSalByGenderDept);

        //Print Average salary of each department.
        Map<String, Double> averageDeptSalary = employeesList.stream()
                .collect(Collectors.groupingBy(Employee::getDeptName,
                        Collectors.averagingDouble(Employee::getSalary)));

        System.out.println(averageDeptSalary);

        //To get a list of employees from each department whose salary is greater than the average salary of their department
        Map<String, List<Employee>> salaryGreaterThanAvg = employeesList.stream()
                .filter(emp -> emp.getSalary() > averageDeptSalary.get(emp.getDeptName()))
                .collect(Collectors.groupingBy(Employee::getDeptName));

        System.out.println(salaryGreaterThanAvg);

        //Sort the employees salary in the organisation in ascending order
        List<Employee> sortedEmployees = employeesList.stream()
                .sorted(Comparator.comparingLong(Employee::getSalary))
                .collect(Collectors.toList());

        System.out.println(sortedEmployees);

        //Sort the employees salary in each department in ascending order
        Map<String, List<Employee>> sortedSalByDept = employeesList.stream()
                        .collect(Collectors.groupingBy(Employee::getDeptName,
                                Collectors.collectingAndThen(Collectors.toList(),
                                        list -> list.stream()
                                                .sorted(Comparator.comparingLong(Employee::getSalary))
                                                .collect(Collectors.toList()))));

        System.out.println(sortedSalByDept);

        //Sort the employees salary in each department in descending order
        Map<String, List<Employee>> reversedSortedSalByDept = employeesList.stream()
                .collect(Collectors.groupingBy(Employee::getDeptName,
                        Collectors.collectingAndThen(Collectors.toList(),
                                list -> list.stream()
                                        .sorted(Comparator.comparingLong(Employee::getSalary).reversed())
                                        .collect(Collectors.toList()))));

        System.out.println(reversedSortedSalByDept);

        //Sort the employees salary in the organisation in descending order.
        List<Employee> reverseSortedEmployees = employeesList.stream()
                .sorted(Comparator.comparingLong(Employee::getSalary).reversed())
                .collect(Collectors.toList());

        System.out.println(reverseSortedEmployees);

    }
}
