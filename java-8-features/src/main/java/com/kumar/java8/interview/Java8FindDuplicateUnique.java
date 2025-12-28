package com.kumar.java8.interview;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Java8FindDuplicateUnique {

	public static void main(String[] args) {
		String input = "ilovejavatechie";
		
		Map<String, Long> map = Arrays.stream(input.split(""))
			.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
		System.out.println(map);
//		map.entrySet().stream().filter(x -> x.getValue() > 1).forEach(x -> System.out.println(x.getKey()));
		
		List<String> duplicates = Arrays.stream(input.split(""))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream()
				.filter(x -> x.getValue() > 1).map(Map.Entry::getKey).collect(Collectors.toList());
		
		System.out.println(duplicates);
		
		List<String> uniques = Arrays.stream(input.split(""))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream()
				.filter(x -> x.getValue() == 1).map(Map.Entry::getKey).collect(Collectors.toList());
		
		System.out.println(uniques);

	}

}
