package in.kumarrahul.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UniqueStringWithHash {

    public static void main (String [] args){
        /**
         * Extract unique matching strings from String array
         *
         * Write a Java 8 program to extract Unique String starting with "#" from the String array Using Java Streams
         */

        String[] input = new String[]{
                "This JEP is #mainly for scientific #applications",
                "and it makes #floating-point operations consistently #strict.",
                "The default #floating-point operations are #strict or strictfp,"
        };

        List<String> hashedString = Arrays.stream(input)
                .flatMap(line -> Arrays.stream(line.split(" ")))
                .filter(word -> word.startsWith("#"))
                .map(word -> "#" + word.substring(1).replaceAll("[^a-zA-Z-]", ""))
                .distinct()
                .collect(Collectors.toList());

        System.out.println(hashedString);
    }
}
