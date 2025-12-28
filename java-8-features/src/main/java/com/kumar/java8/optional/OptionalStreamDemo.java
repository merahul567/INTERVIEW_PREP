package com.kumar.java8.optional;

import java.util.List;

import com.kumar.java8.stream.mapreduce.Customer;
import com.kumar.java8.stream.mapreduce.EkartDataBase;

public class OptionalStreamDemo {
	
	public static Customer getCustomerByEmailId(String email) throws Exception {
		List<Customer> customers = EkartDataBase.getAll();
		
		return customers.stream().filter(c -> c.getEmail().equals(email))
		.findAny().orElseThrow(() -> new Exception("No Customer present with this email"));
	}

	public static void main(String[] args) throws Exception {
		System.out.println(getCustomerByEmailId("john@gmail.co"));

	}

}
