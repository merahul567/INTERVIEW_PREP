package in.kumarrahul.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SumOf10Natural {

    public static void main (String [] args){
        /**
         * Find the sum of the first 10 natural numbers
         *
         * Write a Java 8 program to find the sum of the first 10 natural numbers using streams.
         */

        int sumOf10 = IntStream.rangeClosed(1, 10).sum();

        System.out.println(sumOf10);

    }
}
