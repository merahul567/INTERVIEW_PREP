package com.kumar.interview.autowired.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class AutowiredApp {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(AutowiredApp.class, args);
		UserPaymentService service = context.getBean(UserPaymentService.class);
		
		System.out.println(service.processPayment());

	}

}
