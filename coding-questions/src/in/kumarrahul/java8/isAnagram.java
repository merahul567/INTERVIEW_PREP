package in.kumarrahul.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class isAnagram {

    public static void main (String [] args){
        /**
         * Check if two strings are anagrams or not using Java 8 streams
         * Write a Java 8 program to check if two strings are anagrams or not using the stream API and lambda expressions.
         */

        String word1 = "dusty";
        String word2 = "study";

        List<Character> sorted1 = word1.chars().sorted().mapToObj(ch -> (char) ch).collect(Collectors.toList());
        List<Character> sorted2 = word2.chars().sorted().mapToObj(ch -> (char) ch).collect(Collectors.toList());

        System.out.println(sorted1.equals(sorted2));

        char [] split1 = word1.toCharArray();
        char [] split2 = word2.toCharArray();
        Arrays.sort(split1);
        Arrays.sort(split2);

        System.out.println(Arrays.equals(split1, split2));

        String join1 = Arrays.stream(word1.split("")).sorted().collect(Collectors.joining(""));
        String join2 = Arrays.stream(word2.split("")).sorted().collect(Collectors.joining(""));

        System.out.println(join1.equals(join2));
    }
}
