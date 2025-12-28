package in.kumarrahul.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Min3Max3FromList {

    public static void main (String [] args){
        /**
         * Get the three maximum and three minimum numbers from a given list of integers
         *
         * Write a Java 8 program to get the three maximum and three minimum numbers from a given list of integers.
         */

        List<Integer> intList = Arrays.asList(1, 50, 70, 23, 55, 77, 22, 0);

        List<Integer> min3FromList =
                intList.stream().sorted().limit(3).collect(Collectors.toList());

        System.out.println(min3FromList);

        List<Integer> max3FromList =
                intList.stream().sorted(Comparator.reverseOrder()).limit(3).collect(Collectors.toList());

        System.out.println(max3FromList);

    }
}
