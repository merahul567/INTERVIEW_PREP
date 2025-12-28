package com.kumar.java8.functional;

import java.util.Arrays;
import java.util.List;

//public class PredicateDemo implements Predicate<Integer>{
public class PredicateDemo{
	
//	@Override
//	public boolean test(Integer t) {
//		if(t % 2 == 0) {
//			return true;
//		}else {
//			return false;
//		}
//	}
	
	public static void main(String[] args) {
		//PredicateDemo predicate = new PredicateDemo();
		//Predicate<Integer> predicate = x -> x % 2 == 0;
//		System.out.println(predicate.test(6));
//		System.out.println(predicate.test(7));
		
		
		List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
		list1.stream().filter(x -> x % 2 == 0).forEach(x -> System.out.println("Printing Even: "+ x));

	}

}
