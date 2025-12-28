package in.kumarrahul.java8;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.summarizingInt;

public class MinMaxFromList {

    public static void main (String [] args){
        /**
         * Find the maximum and minimum of a list of integers
         * Given a list of integers, write a Java 8 program to find the maximum and minimum numbers in the list.
         */

        List<Integer> intList = Arrays.asList(1, 50, 70, 23, 55, 77, 22, 0);

        Integer minFromList =
                intList.stream().max(Integer:: compareTo).orElse(Integer.MIN_VALUE);

        System.out.println(minFromList);

        Integer maxFromList =
                intList.stream().min(Integer:: compareTo).orElse(Integer.MAX_VALUE);

        System.out.println(maxFromList);

        IntSummaryStatistics summaryStatistics = intList.stream()
                .collect(summarizingInt(Integer::intValue));

        System.out.println(summaryStatistics.getMax());
        System.out.println(summaryStatistics.getMin());
        System.out.println(summaryStatistics.getCount());
        System.out.println(summaryStatistics.getSum());
        System.out.println(summaryStatistics.getAverage());

    }
}
