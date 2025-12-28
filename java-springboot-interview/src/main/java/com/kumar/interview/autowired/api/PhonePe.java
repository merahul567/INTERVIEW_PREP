package com.kumar.interview.autowired.api;

import org.springframework.stereotype.Service;

@Service
public class PhonePe implements Payment{

	@Override
	public String doTransaction() {
		return "Payment processing using phonepe...";
	}

}
