package com.kumar.java8.interview;

import java.util.stream.IntStream;

public class Java8Join {

	public static void main(String[] args) {
		IntStream.rangeClosed(1, 10).skip(1).limit(8).forEach(System.out::println);;	
	}

}
