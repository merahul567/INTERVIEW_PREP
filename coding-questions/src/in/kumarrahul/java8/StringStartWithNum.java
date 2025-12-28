package in.kumarrahul.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StringStartWithNum {

    public static void main (String [] args){
        /**
         * Find strings in a list that start with a number
         *
         * Given a list of strings, write a Java 8 program to find the strings that start with a number.
         */

        List<String> wordList = Arrays.asList("ankita", "1rahul", "sonu", "2sumit");

        List<String> numberedWord = wordList.stream().filter(x -> Character.isDigit(x.charAt(0))).collect(Collectors.toList());

        System.out.println(numberedWord);
    }
}
