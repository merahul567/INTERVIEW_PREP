package in.kumarrahul.java8;

import java.util.*;
import java.util.stream.Collectors;

public class CalculateSumAndAverage {

    public static void main (String [] args){
        /**
         * Find the sum and average of all elements in an integer array
         *
         * Write a Java 8 program to find the sum and average of all elements in an integer array.
         */

        List<Integer> intList = Arrays.asList(1, 50, 70, 23, 55, 77, 22, 0);

        Integer sumOfList =
                intList.stream().collect(Collectors.summingInt(Integer::intValue));

        System.out.println(sumOfList);

        Double averageOfList =
                intList.stream().collect(Collectors.averagingInt(Integer::intValue));

        System.out.println(averageOfList);

        Integer sumOfList2 =
                intList.stream().mapToInt(Integer::intValue).sum();

        System.out.println(sumOfList2);

        Double averageOfList2 =
                intList.stream().mapToDouble(Integer::intValue).average().orElse(0.0);

        System.out.println(averageOfList2);

        IntSummaryStatistics summaryStatistics = intList.stream().collect(Collectors.summarizingInt(Integer::intValue));

        System.out.println(summaryStatistics.getSum());

        System.out.println(summaryStatistics.getAverage());
    }
}
