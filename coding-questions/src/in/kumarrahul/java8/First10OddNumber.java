package in.kumarrahul.java8;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class First10OddNumber {

    public static void main (String [] args){
        /**
         * Print the first 10 odd numbers
         *
         * Write a Java 8 program to print the first 10 odd numbers.
         */

        Stream.iterate(1, i -> i+2).limit(10).forEach(System.out::println);

    }
}
