package com.kumar.java8.interview;

import java.util.Arrays;
import java.util.List;

public class Java8SkipLimit {

	public static void main(String[] args) {
		List<String> numbers = Arrays.asList("1", "2", "3", "4", "5");
		
		String results = String.join("-", numbers);
		System.out.println(results);
		
		
	}

}
