package com.kumar.java8.methodreference;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MethodReferenceDemo {

	public static void main(String[] args) {
		EmployeeService service = new EmployeeService();
		
		//anonymous implementation
//		service.loadEmployeesFromDB().forEach(new Consumer<Employee>() {
//			@Override
//			public void accept(Employee t) {
//				System.out.println(t);
//				
//			}
//		});
		
		//lambda expression
		//service.loadEmployeesFromDB().forEach((e) -> System.out.println(e));
		
		//method reference
		//service.loadEmployeesFromDB().forEach(MethodReferenceDemo::print);
		
		//method reference
		//service.loadEmployeesFromDB().forEach(System.out::println);
		
//		List<EmployeeDO> employeeDOS = service.loadEmployeesFromDB()
//			.stream()
//			.map(new Function<Employee, EmployeeDO>() {
//
//				@Override
//				public EmployeeDO apply(Employee employee) {
//					EmployeeDO employeeDO = new EmployeeDO();
//					employeeDO.setId(employee.getId());
//					employeeDO.setName(employee.getName());
//					employeeDO.setSalary(employee.getSalary());
//					
//					return employeeDO;
//				}
//			}).collect(Collectors.toList());
		
//		List<EmployeeDO> employeeDOS = service.loadEmployeesFromDB().stream().map((employee) -> {
//			EmployeeDO employeeDO = new EmployeeDO();
//			employeeDO.setId(employee.getId());
//			employeeDO.setName(employee.getName());
//			employeeDO.setSalary(employee.getSalary());
//			return employeeDO;
//		}).collect(Collectors.toList());
		
//		List<EmployeeDO> employeeDOS = service.loadEmployeesFromDB().stream()
//				.map((e) -> EmployeeMapper.convert(e)).collect(Collectors.toList());
		
//		List<EmployeeDO> employeeDOS = service.loadEmployeesFromDB().stream()
//				.map(EmployeeMapper::convert).collect(Collectors.toList());
		EmployeeMapper mapper = new EmployeeMapper();
		List<EmployeeDO> employeeDOS = service.loadEmployeesFromDB().stream()
		.map(mapper::convert).collect(Collectors.toList());
				
		System.out.println(employeeDOS);
//		List<String> nameList = service.loadEmployeesFromDB().stream().map(e -> e.getName()).collect(Collectors.toList());
//		System.out.println(nameList);

		//Even if getName is non-static we can call it from Static reference if it do not have arguments
		List<String> nameList = service.loadEmployeesFromDB().stream().map(Employee::getName).collect(Collectors.toList());
		System.out.println(nameList);
		
		//Constructor method reference
		//Lambda
		EmployeeManager manager = () -> new Employee();
		manager.getEmployee().getEmployeeInfo();
		
		EmployeeManager manager1 = Employee::new;
		manager1.getEmployee().getEmployeeInfo();
		
		List<Integer> idList = service.loadEmployeesFromDB()
                .stream()
                .map(Employee::getId)
                .collect(Collectors.toCollection(ArrayList::new));
		
		System.out.println(idList);
				
			
	}
	
	public static void print(Employee employee) {
		System.out.println(employee);
	}

}
