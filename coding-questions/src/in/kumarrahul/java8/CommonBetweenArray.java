package in.kumarrahul.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CommonBetweenArray {

    public static void main (String [] args){
        /**
         * Find the common elements between two arrays
         *
         * Write a Java 8 program to find the common elements between two arrays using streams.
         */

        List<Integer> list1 = Arrays.asList(12, 32, 2, 4, 777, 5, 32, 890, 422, 44, 99, 43);
        List<Integer> list2 = Arrays.asList(4, 32, 2, 5, 6, 78, 98, 53, 90);

        List<Integer> commonList = list1.stream().filter(x -> list2.contains(x))
                .collect(Collectors.toList());

        System.out.println(commonList);

        List<Integer> commonList2 = list1.stream().filter(list2::contains)
                .collect(Collectors.toList());

        System.out.println(commonList2);

    }
}
