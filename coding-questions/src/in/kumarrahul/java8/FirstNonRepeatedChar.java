package in.kumarrahul.java8;

import java.util.Arrays;

public class FirstNonRepeatedChar {

    public static void main (String [] args){
        /**
         * Find the first non-repeated character in a string
         *
         * Write a Java 8 program to find the first non-repeated character in a string.
         */

        String word = "rahull";

        String firstNonRepeated = Arrays.stream(word.split(""))
                .filter(c -> word.indexOf(c) == word.lastIndexOf(c))
                        .findFirst().orElse("");

        System.out.println(firstNonRepeated);

    }
}
