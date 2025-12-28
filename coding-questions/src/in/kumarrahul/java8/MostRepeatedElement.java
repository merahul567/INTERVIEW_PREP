package in.kumarrahul.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MostRepeatedElement {

    public static void main (String [] args){
        /**
         * Find the most repeated element in an array
         *
         * Write a Java 8 program to find the most repeated element in an array.
         */

        int [] arr = {12, 32, 2, 4, 2, 2, 32, 890, 422, 44, 99, 43};

        int  mostRepeated = Arrays.stream(arr)
                .boxed().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                        .entrySet().stream().max(Map.Entry.comparingByValue()).get()
                        .getKey();

        System.out.println(mostRepeated);

    }
}
