package com.kumar.java8.demo;

interface Calculator{
//	void switchOn();
	
//	void sum(int input);
	
	int substract(int i1, int i2);
}

public class CalculatorImpl {
//public class CalculatorImpl implements Calculator{

//	@Override
//	public void switchOn() {
//		System.out.println("Switch On");	
//	}
	
	public static void main(String[] args) {
//		Calculator calculator = () -> System.out.println("Switch On");	
//		calculator.switchOn();
		
//		Calculator calculator = (input) -> System.out.println("Sum: " + input);
//		calculator.sum(5);
		
//		Calculator calculator = (i1, i2) -> i2 - i1;
		
		Calculator calculator = (i1, i2) -> {
			if(i2>i1) {
				throw new RuntimeException("Second number should be greater...");
			}else {
				return i2-i1;
			}
		};
		System.out.println(calculator.substract(5, 11));
	}
	
}
