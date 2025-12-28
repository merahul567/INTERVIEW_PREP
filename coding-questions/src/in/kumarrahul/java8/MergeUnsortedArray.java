package in.kumarrahul.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MergeUnsortedArray {

    public static void main (String [] args){
        /**
         * Merge two unsorted arrays into a single sorted array using Java 8 streams
         * Write a Java 8 program to merge two unsorted arrays into a single-sorted array using the stream API.
         */

        int [] arr1 = {12, 32, 2, 4, 777, 5, 32, 890, 422, 44, 99, 43};
        int [] arr2 = {4, 32, 2, 5, 6, 78, 98, 53, 90};

        int [] mergedSorted = IntStream.concat(Arrays.stream(arr1), Arrays.stream(arr2)).sorted().toArray();

        System.out.println(Arrays.toString(mergedSorted));

    }
}
