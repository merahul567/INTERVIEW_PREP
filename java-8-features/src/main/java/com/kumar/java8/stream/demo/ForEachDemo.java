package com.kumar.java8.stream.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ForEachDemo {
	

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Rahul");
		list.add("Sonu");
		list.add("Pondu");
		list.add("Pallavi");
		
//		for(String s: list) {
//			System.out.println(s);
//		}
		
//		for(String s: list) {
//			if(s.startsWith("R")) {
//				System.out.println(s);
//			}
//		}
		
		list.stream().filter(x -> x.startsWith("P")).forEach(x -> System.out.println(x));
		
		//list.stream().forEach(x -> System.out.println(x));
		
		Map<Integer, String> map = new HashMap<>();
		
		map.put(1, "a");
		map.put(2, "b");
		map.put(3, "c");
		map.put(4, "d");
		
		//map.forEach((key, value) -> System.out.println(key + ": "+value));
		//map.entrySet().stream().forEach(obj -> System.out.println(obj));
		map.entrySet().stream().filter(x -> x.getKey() % 2 == 0).forEach(obj -> System.out.println(obj));
		//Consumer<String> consumer = (x) -> System.out.println(x);
		
//		for(String s: list) {
//			consumer.accept(s);
//		}

	}

}
