package in.kumarrahul.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class JoinListOfString {

    public static void main (String [] args){
        /**
         * Join a list of strings with '[' as prefix, ']' as suffix, and ',' as delimiter
         *
         * Given a list of strings, write a Java 8 program to join the strings
         * with '[' as a prefix, ']' as a suffix, and ',' as a delimiter.
         */

        List<String> wordList = Arrays.asList("rahul", "ankita", "sonu", "sumit");

        String JoinedString =
                wordList.stream()
                        .collect(Collectors.joining(",", "[", "]"));

        System.out.println(JoinedString);

    }
}
