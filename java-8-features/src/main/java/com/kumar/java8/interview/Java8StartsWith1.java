package com.kumar.java8.interview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Java8StartsWith1 {

	public static void main(String[] args) {
		int [] numbers = {2, 6, 10, 15, 1, 88, 55, 23, 66};
		
		List<String> startsWith1 = Arrays.stream(numbers).boxed().map(s->s+"").filter(x->x.startsWith("1")).collect(Collectors.toList());

		System.out.println(startsWith1);

	}

}
