package com.kumar.java8.functional;

import java.util.Arrays;
import java.util.List;

//public class SupplierDemo implements Supplier<String>{
public class SupplierDemo{

//	@Override
//	public String get() {
//		return "Hi Rahul!";
//	}

	public static void main(String[] args) {
//		SupplierDemo supplier = new SupplierDemo();
		//Supplier<String> supplier = () -> "Hi Rahul!!";
		//System.out.println(supplier.get());
		
//		List<String> list1 = Arrays.asList("A", "B");
		List<String> list1 = Arrays.asList();

//		System.out.println(list1.stream().findAny().orElseGet(supplier));
		System.out.println(list1.stream().findAny().orElseGet( () -> "No element found!"));
		
	}

}
