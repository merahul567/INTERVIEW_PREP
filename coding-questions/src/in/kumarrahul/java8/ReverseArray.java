package in.kumarrahul.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ReverseArray {

    public static void main (String [] args){
        /**
         * Reverse an integer array
         *
         * Write a Java 8 program to reverse an integer array.
         */

        int [] arr = {12, 32, 2, 4, 777, 5, 32, 890, 422, 44, 99, 43};

        int []  reversedArray = IntStream.rangeClosed(1, arr.length)
                .map(n -> arr[arr.length - n]).toArray();

        System.out.println(Arrays.toString(reversedArray));


    }
}
