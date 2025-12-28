package in.kumarrahul.java8;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PalindromeString {

    public static void main (String [] args){
        /**
         * Check if a string is a palindrome using Java 8 streams
         *
         * Write a Java 8 program to check if a given string is a palindrome using the stream API and lambda expressions.
         */

        String word = "ababa";

        boolean IsPalindrome = IntStream.rangeClosed(0, word.length()/2)
                        .allMatch(i -> word.charAt(i) == word.charAt(word.length() -1 - i));

        System.out.println(IsPalindrome);

        boolean IsPalindrome2 = IntStream.rangeClosed(0, word.length()/2)
                .noneMatch(i -> word.charAt(i) != word.charAt(word.length() -1 - i));

        System.out.println(IsPalindrome2);

    }
}
