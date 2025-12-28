package in.kumarrahul.java8;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MergeUnsortedArrayWithoutDuplicate {

    public static void main (String [] args){
        /**
         * Merge two unsorted arrays into a single sorted array without duplicates
         * Write a Java 8 program to merge two unsorted arrays into a single-sorted array without duplicates.
         */

        int [] arr1 = {12, 32, 2, 4, 777, 5, 32, 890, 422, 44, 99, 43};
        int [] arr2 = {4, 32, 2, 5, 6, 78, 98, 53, 90};

        int [] mergedSortedDistinct = IntStream.concat(Arrays.stream(arr1), Arrays.stream(arr2)).sorted().distinct().toArray();

        System.out.println(Arrays.toString(mergedSortedDistinct));

    }
}
