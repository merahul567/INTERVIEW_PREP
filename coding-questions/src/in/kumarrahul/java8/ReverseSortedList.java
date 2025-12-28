package in.kumarrahul.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ReverseSortedList {

    public static void main (String [] args){
        /**
         * Sort a given list of decimals in reverse order
         *
         * Write a Java 8 program to sort a given list of decimal numbers in reverse order.
         */

        List<Integer> intList = Arrays.asList(1, 55, 77, 23, 54, 77, 22, 11);

        List<Integer> reverseSortedMethod =
                intList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());

        System.out.println(reverseSortedMethod);

        List<Integer> reverseSortedManual =
                intList.stream().sorted((x, y) -> Integer.compare(y, x))
                        .collect(Collectors.toList());

        System.out.println(reverseSortedManual);

    }
}
