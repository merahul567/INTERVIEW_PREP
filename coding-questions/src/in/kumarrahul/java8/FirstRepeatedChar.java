package in.kumarrahul.java8;

import java.util.Arrays;
import java.util.stream.IntStream;

public class FirstRepeatedChar {

    public static void main (String [] args){
        /**
         * Find the first repeated character in a string
         * Write a Java 8 program to find the first repeated character in a string.
         */

        String word = "rahull";

        String firstRepeated = Arrays.stream(word.split(""))
                .filter(c -> word.indexOf(c) != word.lastIndexOf(c))
                        .findFirst().orElse("");

        System.out.println(firstRepeated);

    }
}
