package in.kumarrahul.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SumOfAllDigit {

    public static void main (String [] args){
        /**
         * Find the sum of all digits of a number in Java 8
         *
         * Write a Java 8 program to find the sum of all digits of a given number.
         *
         */

        int number = 45623;

        int sumOfAll = Integer.toString(number).chars().map(Character :: getNumericValue).sum();

        System.out.println(sumOfAll);

    }
}
