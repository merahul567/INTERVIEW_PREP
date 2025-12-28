package in.kumarrahul.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SecondLargestFromList {

    public static void main (String [] args){
        /**
         * Find the second-largest number in an integer array
         *
         * Write a Java 8 program to find the second-largest number in an integer array.
         */

        List<Integer> intList = Arrays.asList(1, 50, 70, 23, 55, 77, 22, 0);

        Integer secondLargest =
                intList.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElse(Integer.MAX_VALUE);

        System.out.println(secondLargest);

    }
}
