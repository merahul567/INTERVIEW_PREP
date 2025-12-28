package in.kumarrahul.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseEachWord {

    public static void main (String [] args){
        /**
         * Reverse each word of a string using Java 8 streams
         *
         * Write a Java 8 program to reverse each word of a given string using the stream API and lambda expressions
         */

        String sentence = "My name is Rahul Kumar";

        String reversEachWord = Arrays.stream(sentence.split(" "))
                        .map(x -> new StringBuilder(x).reverse()).collect(Collectors.joining(" "));

        System.out.println(reversEachWord);

    }
}
