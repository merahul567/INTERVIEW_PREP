package in.kumarrahul.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ExtractDuplicateFromList {

    public static void main (String [] args){
        /**
         * Extract duplicate elements from an array
         *
         * Write a Java 8 program to extract duplicate elements from an array.
         */

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 5, 4, 22, 0, 3, 44, 0);

        List<Integer> duplicateElement = list.stream()
                .filter(n -> list.indexOf(n) != list.lastIndexOf(n)).collect(Collectors.toList());

        System.out.println(duplicateElement);
    }
}
