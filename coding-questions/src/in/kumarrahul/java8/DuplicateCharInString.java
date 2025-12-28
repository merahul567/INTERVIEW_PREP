package in.kumarrahul.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateCharInString {

    public static void main (String [] args){
        /**
         /**
         * Print duplicate characters in a string
         * Write a Java 8 program to print the duplicate characters in a string.
         */

        String word = "ankita";

        List<Character> duplicateString = Arrays.stream(word.split("")).filter(x -> word.indexOf(x) != word.lastIndexOf(x))
                .map(str -> str.charAt(0)).collect(Collectors.toList());

        System.out.println(duplicateString);


    }
}
