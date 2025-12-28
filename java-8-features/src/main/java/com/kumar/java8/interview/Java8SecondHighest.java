package com.kumar.java8.interview;

import java.util.Arrays;
import java.util.Comparator;

public class Java8SecondHighest {

	public static void main(String[] args) {
		int [] numbers = {2, 6, 10, 15, 1, 88, 55, 23, 66};
		
		int secondHighest = Arrays.stream(numbers).boxed().sorted(Comparator.reverseOrder())
				.skip(1)
				.findFirst()
				.get();

		System.out.println(secondHighest);

	}

}
