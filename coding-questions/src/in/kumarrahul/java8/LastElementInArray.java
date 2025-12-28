package in.kumarrahul.java8;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class LastElementInArray {

    public static void main (String [] args){
        /**
         * Get the last element of an array
         *
         * Write a Java 8 program to get the last element of an array.
         */

        int [] intArray = {4, 32, 2, 5, 6, 78, 98, 53, 90};

        int lastElement = Arrays.stream(intArray).skip(intArray.length - 1)
                .findFirst().orElseThrow();

        System.out.println(lastElement);

        int lastElement2 = Arrays.stream(intArray).reduce((first, second) -> second)
                .orElse(-1);

        System.out.println(lastElement2);

    }
}
