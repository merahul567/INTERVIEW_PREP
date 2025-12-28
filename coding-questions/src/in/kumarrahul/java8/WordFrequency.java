package in.kumarrahul.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class WordFrequency {

    public static void main (String [] args){
        /**
         * Find the frequency of each element in an array or a list
         *
         * Write a Java 8 program to find the frequency of
         * each element in an array or a list using streams and collectors.
         */

        List<String> wordList = Arrays.asList("ankita", "rahul", "ankita", "sonu", "sonu", "sumit");

        Map<String, Long> wordFrequency =
                wordList.stream()
                        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(wordFrequency);

    }
}
