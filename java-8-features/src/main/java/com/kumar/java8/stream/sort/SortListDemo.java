package com.kumar.java8.stream.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.kumar.java8.stream.example.DataBase;
import com.kumar.java8.stream.example.Employee;

public class SortListDemo {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(8);
		list.add(3);
		list.add(12);
		list.add(4);
		
		/*
		 * Collections.sort(list); System.out.println(list);
		 * 
		 * Collections.reverse(list); System.out.println(list);
		 * 
		 * list.stream().sorted().forEach(x->System.out.println(x));
		 * 
		 * list.stream().sorted(Comparator.reverseOrder()).forEach(x->System.out.println
		 * (x));
		 */
		
		List<Employee> employees = DataBase.getEmployees();
		
//		Collections.sort(employees, new MyComparator());
//		Collections.sort(employees, new Comparator<Employee>() {
//
//			@Override
//			public int compare(Employee o1, Employee o2) {
//				return (int) (o2.getSalary() - o1.getSalary());
//			}
//			
//		});
		Collections.sort(employees, (o1, o2) -> (int)( o2.getSalary() - o1.getSalary()));
		
		System.out.println(employees);
		
		//employees.stream().sorted((o1, o2) -> (int)( o1.getSalary() - o2.getSalary())).forEach(x -> System.out.println(x));
		
		//employees.stream().sorted(Comparator.comparing(e -> e.getSalary())).forEach(System.out::println);
		
		//employees.stream().sorted(Comparator.comparing(Employee::getName)).forEach(System.out::println);
		
		employees.stream().sorted(Comparator.comparing(Employee::getDept)).forEach(System.out::println);
			
	}

}

//class MyComparator implements Comparator<Employee>{
//
//	@Override
//	public int compare(Employee o1, Employee o2) {
//		return (int) (o1.getSalary() - o2.getSalary());
//	}
//	
//}
