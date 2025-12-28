package in.kumarrahul.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MultipleOf5 {

    public static void main (String [] args){
        /**
         * Print the numbers from a given list of integers that are multiples of 5
         *
         * Write a Java 8 program to print the numbers from a given list of integers that are multiples of 5.
         */

        List<Integer> intList = Arrays.asList(1, 50, 70, 23, 55, 77, 22, 0);

        List<Integer> multipleOf5 =
                intList.stream()
                        .filter(n -> n % 5 == 0).collect(Collectors.toList());

        System.out.println(multipleOf5);

    }
}
