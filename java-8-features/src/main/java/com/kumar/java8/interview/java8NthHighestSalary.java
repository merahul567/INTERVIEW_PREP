package com.kumar.java8.interview;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class java8NthHighestSalary {

	public static void main(String[] args) {
		Map<String, Integer> map1 = new HashMap<>();
		map1.put("anil", 1000);
		map1.put("bhavna", 1300);
		map1.put("james", 2000);
		map1.put("micael", 1700);
		map1.put("tom", 2100);
		map1.put("ankit", 800);
		map1.put("daniel", 1600);
		
//		Map.Entry<String, Integer> result = map1.entrySet().stream()
//				.sorted(Collections.reverseOrder(Map.Entry.comparingByValue())).collect(Collectors.toList()).get(1);
//		System.out.println(result);
		
		//Map.Entry<String, Integer> result = getNthHighestSalaryDemo(3, map1);
		//System.out.println(result);
		
		Map<String, Integer> map2 = new HashMap<>();
		map2.put("anil", 1000);
		map2.put("bhavna", 1300);
		map2.put("james", 2000);
		map2.put("micael", 2000);
		map2.put("tom", 2100);
		map2.put("ankit", 800);
		map2.put("daniel", 1600);
		
		System.out.println(getNthHighestSalaryDemo(2, map2));
		
//		Map.Entry<Integer, List<String>> map = map2.entrySet().stream().collect(
//				Collectors.groupingBy(Map.Entry::getValue, Collectors.mapping(Map.Entry::getKey, Collectors.toList())))
//				.entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByKey())).collect(Collectors.toList()).get(1);
//		
//		System.out.println(map);
		
		System.out.println(getDynamicNthHighestSalaryDemo(2, map2));
		
	}
	
	public static Map.Entry<String, Integer> getNthHighestSalaryDemo(int num, Map<String, Integer> map) {
		return map.entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
				.collect(Collectors.toList()).get(num-1);
		

	}
	
	public static Map.Entry<Integer, List<String>> getDynamicNthHighestSalaryDemo(int num, Map<String, Integer> map) {
		return map.entrySet().stream().collect(
				Collectors.groupingBy(Map.Entry::getValue, Collectors.mapping(Map.Entry::getKey, Collectors.toList())))
				.entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByKey())).collect(Collectors.toList()).get(num-1);
		

	}

}
