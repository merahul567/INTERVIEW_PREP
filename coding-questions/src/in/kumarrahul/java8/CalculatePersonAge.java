package in.kumarrahul.java8;

import java.time.LocalDate;
import java.time.Period;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class CalculatePersonAge {

    public static void main (String [] args){
        /**
         * Calculate the age of a person in years
         *
         * Write a Java 8 program to calculate the age of a person in years given their birthday.
         */

        LocalDate birthDate = LocalDate.of(1995, 1, 4);

        LocalDate currentDate = LocalDate.now();

        int age = Period.between(birthDate, currentDate).getYears();

        System.out.println("Age of the person is: " + age);
    }
}
