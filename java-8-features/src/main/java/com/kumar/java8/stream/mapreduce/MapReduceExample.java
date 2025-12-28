	package com.kumar.java8.stream.mapreduce;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import com.kumar.java8.stream.example.DataBase;

public class MapReduceExample {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(3, 7, 8, 9, 5, 7);
		
		int sum = 0;
		
		for(int number: numbers) {
			sum += number;
		}
		System.out.println(sum);
		
		int sum1 = numbers.stream().mapToInt(i -> i).sum();
		System.out.println(sum1);
		
		Integer sum2 = numbers.stream().reduce(0, (a, b) -> a + b);
		System.out.println(sum2);
		
		Optional<Integer> sum3 = numbers.stream().reduce(Integer::sum);
		System.out.println(sum3.get());
		
		Integer multiples = numbers.stream().reduce(1, (a, b) -> a * b);
		System.out.println(multiples);
		
		int max = numbers.stream().reduce(0, (a, b) -> a>b ? a: b);
		System.out.println(max);
		
		int max1 = numbers.stream().reduce(Integer::max).get();
		System.out.println(max1);
		
		List<String> words = Arrays.asList("Core Java", "Spring", "Hibernate");
		String longest = words.stream().reduce((word1, word2) -> word1.length() > word2.length() ? word1 : word2).get();
		System.out.println(longest);
		
		double averageSalary = DataBase.getEmployees().stream().filter(e -> e.getDept().equalsIgnoreCase("Social"))
				.map(e -> e.getSalary()).mapToDouble(i -> i).average().getAsDouble();
		System.out.println(averageSalary);
		
		double sumSalary = DataBase.getEmployees().stream().filter(e -> e.getDept().equalsIgnoreCase("Social"))
				.map(e -> e.getSalary()).mapToDouble(i -> i).sum();
		System.out.println(sumSalary);
	}

}
