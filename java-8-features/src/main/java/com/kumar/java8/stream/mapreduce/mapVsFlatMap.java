package com.kumar.java8.stream.mapreduce;

import java.util.List;
import java.util.stream.Collectors;

public class mapVsFlatMap {

	public static void main(String[] args) {
		List<Customer> customers = EkartDataBase.getAll();

		List<String> emails = customers.stream().map(c -> c.getEmail()).collect(Collectors.toList());
		System.out.println(emails);

		List<List<String>> phoneNumbers = customers.stream().map(c -> c.getPhoneNumbers()).collect(Collectors.toList());
		System.out.println(phoneNumbers);

		List<String> allPhoneNumbers = customers.stream().flatMap(c -> c.getPhoneNumbers().stream())
				.collect(Collectors.toList());
		System.out.println(allPhoneNumbers);
	}

}
