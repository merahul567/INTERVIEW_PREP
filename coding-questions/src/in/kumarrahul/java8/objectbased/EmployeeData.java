package in.kumarrahul.java8.objectbased;

import java.util.ArrayList;
import java.util.List;

public class EmployeeData {

    public static List<Employee> employeesList = new ArrayList<>();

    static {
        employeesList.add(new Employee(1, "Yanksha", 28, 12300, "F", "HR", "Blore", 2020));
        employeesList.add(new Employee(2, "Francesca", 29, 12000, "F", "HR", "Hyderabad", 2015));
        employeesList.add(new Employee(3, "Ramesh", 30, 11500, "M", "HR", "Chennai", 2014));
        employeesList.add(new Employee(4, "Melanie", 32, 12500, "F", "HR", "Chennai", 2013));

        employeesList.add(new Employee(5, "Padma", 22, 15000, "F", "IT", "Noida", 2013));
        employeesList.add(new Employee(6, "Milad", 27, 14000, "M", "IT", "Gurugram", 2017));
        employeesList.add(new Employee(7, "Jzma", 26, 13000, "F", "IT", "Pune", 2016));
        employeesList.add(new Employee(8, "Ali", 25, 14500, "M", "IT", "Trivandam", 2015));
        employeesList.add(new Employee(9, "Ram", 25, 16000, "M", "IT", "Blore", 2010));
    }
}
