package com.kumar.interview.autowired.app;

import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import com.kumar.interview.autowired.api.Payment;

import jakarta.annotation.Resource;

@Component
@PropertySource(value = {"application.properties"})
public class UserPaymentService {
	
	//@Autowired
	//@Qualifier("phonePe")
	@Resource(name = "${beanName}")  // @Autowired not needed if using @Resource
	private Payment payment;
	
	public String processPayment() {
		return payment.doTransaction();
	}
}
