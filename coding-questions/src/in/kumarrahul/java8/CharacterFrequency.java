package in.kumarrahul.java8;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharacterFrequency {

    public static void main (String [] args){
        /**
         * Find the frequency of each character in a string using Java 8 streams
         *
         * Write a Java 8 program to find the frequency of each character in
         * a given string using the stream API and collectors.
         */

        String word = "ankita";

        Map<Character, Long> countUsingChar =
                word.chars().mapToObj(ch -> (char) ch)
                        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(countUsingChar);

        Map<String, Long> countUsingString = Arrays.stream(word.split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(countUsingString);

        Map<String, Integer> countUsingInt =
                Arrays.stream(word.split(""))
                        .collect(Collectors.groupingBy(Function.identity(),
                                Collectors.collectingAndThen(Collectors.counting(), Long::intValue)));

        System.out.println(countUsingInt);


    }
}
