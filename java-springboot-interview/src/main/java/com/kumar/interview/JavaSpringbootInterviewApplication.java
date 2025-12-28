package com.kumar.interview;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.kumar.interview.autowired.app.UserPaymentService;

@SpringBootApplication
public class JavaSpringbootInterviewApplication {

	public static void main(String[] args) {
		//SpringApplication.run(JavaSpringbootInterviewApplication.class, args);
		
		ApplicationContext context = SpringApplication.run(JavaSpringbootInterviewApplication.class, args);
		UserPaymentService service = context.getBean(UserPaymentService.class);
		
		System.out.println(service.processPayment());
	}

}
