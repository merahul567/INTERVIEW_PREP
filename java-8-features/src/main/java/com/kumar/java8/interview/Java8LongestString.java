package com.kumar.java8.interview;

import java.util.Arrays;

public class Java8LongestString {

	public static void main(String[] args) {
		String[] strArray = {"java", "springboot", "react", "angular"};
		
		String longest = Arrays.stream(strArray).reduce((word1, word2) -> word1.length() > word2.length() ? word1: word2)
		.get();
		
		System.out.println(longest);

	}

}
