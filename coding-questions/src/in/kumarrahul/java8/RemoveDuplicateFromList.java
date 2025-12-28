package in.kumarrahul.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicateFromList {

    public static void main (String [] args){
        /**
         * Remove duplicate elements from a list using Java 8 streams
         *
         * Write a Java 8 program to remove duplicate elements from a list
         * using the stream API and lambda expressions.
         */

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 5, 4, 22, 0, 3, 44, 0);

        List<Integer> distinctList = list.stream().distinct().collect(Collectors.toList());

        System.out.println(distinctList);

        list.stream().distinct().forEach(System.out::println);

        Set<Integer> distinctSet = list.stream().collect(Collectors.toSet());

        System.out.println(distinctSet);

        List<Integer> uniqueElement = list.stream()
                .filter(n -> list.indexOf(n) == list.lastIndexOf(n)).collect(Collectors.toList());

        System.out.println(uniqueElement);
    }
}
