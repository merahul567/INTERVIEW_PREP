package com.kumar.java8.stream.example;

import java.util.ArrayList;
import java.util.List;

public class DataBase {
	public static List<Employee> getEmployees(){
		List<Employee> list = new ArrayList<>();
		list.add(new Employee(176, "Rahul", "IT", 400000));
		list.add(new Employee(388, "Raushan", "Social", 450000));
		list.add(new Employee(470, "Raj", "Social", 700000));
		list.add(new Employee(624, "Ravi", "Core", 800000));
		list.add(new Employee(176, "Mayank", "Civil", 850000));
		
		return list;
	}
}
