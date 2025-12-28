package com.kumar.java8.methodreference;

public class Test {
	
	public void m1() {
		System.out.println("m1() instance/non-static method");
	}

	public static void m2() {
		System.out.println("m2() static method");
	}

		
	public static void main(String[] args) {
		Test.m2();
		Test test = new Test();
		test.m1();
		
		// signature of method reference (will not work)
		//MethodReferenceDemo::m2(); //static method reference	
		//test::m1(); //instance method reference
	}

}
