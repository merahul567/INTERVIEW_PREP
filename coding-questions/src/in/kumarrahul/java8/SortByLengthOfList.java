package in.kumarrahul.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortByLengthOfList {

    public static void main (String [] args){
        /**
         * Sort a list of strings according to the increasing order of their length
         *
         * Write a Java 8 program to sort a given list of strings according to the increasing order of their length.
         */

        List<String> strList = Arrays.asList("rahul", "sonu", "pallavi", "meghna", "sumit");

        List<String> sortedByLength  =
                strList.stream().sorted(Comparator.comparingInt(String::length)).collect(Collectors.toList());

        System.out.println(sortedByLength);

    }
}
