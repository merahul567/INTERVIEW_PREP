package in.kumarrahul.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GenerateFibonacci {

    public static void main (String [] args){
        /**
         * Generate the Fibonacci series
         *
         * Write a Java 8 program to generate the Fibonacci series.
         */

        Stream.iterate(new int[]{0,1}, i -> new int[]{i[1], i[0] + i[1]})
                .limit(10)
                .map(i -> i[0])
                .forEach(System.out::println);

        Function<int[], List<Integer>> intArraytoListOFInt = array -> Arrays.stream(array).boxed()
                .collect(Collectors.toList());

        List<Integer> collect = Stream.iterate(new int[]{0, 1}, t -> new int[]{t[1], t[0] + t[1]})
                .limit(10)
                .map(intArraytoListOFInt)
                .flatMap(List::stream)
                .distinct()
                .collect(Collectors.toList());
        System.out.println(collect);
    }
}
