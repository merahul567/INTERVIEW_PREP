package com.kumar.java8.functional;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

//public class ConsumerDemo implements Consumer<Integer>{
public class ConsumerDemo{
	
//	@Override
//	public void accept(Integer t) {
//		System.out.println("Printing: "+ t);
//		
//	}
	
	public static void main(String[] args) {
		//ConsumerDemo consumer = new ConsumerDemo();
		Consumer<Integer> consumer = x -> System.out.println("Printing: "+ x);
		consumer.accept(10);
		
		List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
		
//		list1.stream().forEach(consumer);
		list1.stream().forEach(x -> System.out.println("Printing: "+ x));
	}

}
