package in.kumarrahul.java8;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SeparateEvenOddFromList {

	public static void main(String[] args) {
		/**
         * Separate odd and even numbers in a list of integers.
         *
         * Given a list of integers, write a Java 8 program to separate
         * the odd and even numbers into two separate lists.
         */
		
		// Java 9+
        List<Integer> oneToTen = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // In List
        Collection<List<Integer>> evenOddList = oneToTen.stream()
                .collect(Collectors.collectingAndThen(Collectors.partitioningBy(i -> i % 2 == 0),
                        Map::values));

        System.out.println(evenOddList);
        
        System.out.println();
        
        // In Map
        Map<Boolean, List<Integer>> evenAddOddSeparation = oneToTen.stream()
                .collect(Collectors.partitioningBy(i -> i % 2 == 0));

        System.out.println(evenAddOddSeparation);
        
        System.out.println();
        
        System.out.println("Even Numbers: " + evenAddOddSeparation.get(true));
        System.out.println("Odd Numbers: " + evenAddOddSeparation.get(false));

	}

}
