package com.kumar.java8.interview;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Java8CountOccurence {

	public static void main(String[] args) {
		String input = "ilovejavatechie";
		
		Map<String, Long> map = Arrays.stream(input.split(""))
			.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
		System.out.println(map);

	}

}
