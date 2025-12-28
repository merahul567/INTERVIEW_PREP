package com.kumar.java8.optional;

import java.util.Arrays;
import java.util.Optional;

import com.kumar.java8.stream.mapreduce.Customer;

public class OptionalDemo {

	public static void main(String[] args) {
		Customer customer = new Customer(101, "rahul", null, Arrays.asList("99999", "88888"));
		
		Optional<Object> emptyOptional = Optional.empty();
		System.out.println(emptyOptional);
		
//		Optional<String> emailOptional = Optional.of(customer.getEmail());
//		System.out.println(emailOptional);
		
		Optional<String> emailOptional2 = Optional.ofNullable(customer.getEmail());
		
//		if(emailOptional2.isPresent()) {
//			System.out.println(emailOptional2.get());
//		}
		
		System.out.println(emailOptional2.orElse("default@xyz.com"));
		
		//System.out.println(emailOptional2.orElseThrow( () -> new IllegalArgumentException("Email Not Present")));
		
		System.out.println(emailOptional2.map(String::toUpperCase).orElseGet(()-> "default email"));
	}

}
