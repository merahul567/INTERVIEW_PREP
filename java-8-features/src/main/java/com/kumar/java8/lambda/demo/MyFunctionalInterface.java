package com.kumar.java8.lambda.demo;

@FunctionalInterface
public interface MyFunctionalInterface {
	
	void m1();
	
	//we need to remove @FunctionalInterface as it will be no more FunctionalInterface if we have 2 abstract method
	//void m2();
	
	default void m3() {
		System.out.println("Default method-1");
	}
	
	default void m4() {
		System.out.println("Default method-2");
	}
	
	static void m5() {
		System.out.println("static cethod-2");
	}

}
