package com.rabo.yepp.streams;

import java.util.Arrays;
import java.util.List;

public class Exercise01 {

    public static void main(String[] args) {

        List<Integer> integerList = Arrays.asList(10, -42, 3, 14, -52, 67, 23, -65, 2, -12, 65);

        // Create stream and use forEach to
        integerList.stream()
                .forEach( n-> printNumber( n));

        // Create stream and use filter to collect negative numbers


        // Create stream and use filter to collect even numbers
        // Note: (n / 2) == 0 means n = even


        // Create stream and use filter to collect numbers > -15 and < 43



    }

    private static void printNumber( Integer number){
        System.out.println(number);

    }
}
