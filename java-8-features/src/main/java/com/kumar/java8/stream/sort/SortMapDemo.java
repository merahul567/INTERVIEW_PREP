package com.kumar.java8.stream.sort;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import com.kumar.java8.stream.example.Employee;

public class SortMapDemo {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		
		map.put("eight", 8);
		map.put("ten", 10);
		map.put("four", 4);
		map.put("two", 2);
		
		//List<Entry<String, Integer>> entries = new ArrayList<>(map.entrySet());
//		Collections.sort(entries, new Comparator<Entry<String, Integer>>() {
//
//			@Override
//			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
//				//return o1.getKey().compareTo(o2.getKey());
//				return Integer.compare(o1.getValue(), o2.getValue());
//			}
//		});
		
//		Collections.sort(entries, (o1, o2) -> o1.getKey().compareTo(o2.getKey()));
//		
//		for(Entry<String, Integer> entry: entries) {
//			System.out.println(entry.getKey() + ": " + entry.getValue());
//		}
		
		//map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
		//map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
		
//		Map<Employee, Integer> employeeMap = new TreeMap<>(new Comparator<Employee>() {
//
//			@Override
//			public int compare(Employee o1, Employee o2) {
//				return (int) (o1.getSalary() - o2.getSalary());
//			}
//		});
		
		Map<Employee, Integer> employeeMap = new TreeMap<>((e1, e2) -> (int) (e2.getSalary() - e1.getSalary()));
		
		employeeMap.put(new Employee(176, "Rahul", "IT", 400000), 60);
		employeeMap.put(new Employee(388, "Raushan", "Social", 450000), 90);
		employeeMap.put(new Employee(470, "Raj", "Defence", 700000), 50);
		employeeMap.put(new Employee(624, "Ravi", "Core", 800000), 40);
		employeeMap.put(new Employee(176, "Mayank", "Civil", 850000), 120);
		
		System.out.println(employeeMap);
		
//		employeeMap.entrySet().stream()
//				.sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getSalary).reversed()))
//				.forEach(System.out::println);
		
		employeeMap.entrySet().stream()
		.sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getDept)))
		.forEach(System.out::println);
	}

}
