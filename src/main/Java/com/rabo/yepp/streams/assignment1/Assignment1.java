package com.rabo.yepp.streams.assignment1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static com.rabo.yepp.testing.assertion.Assertions.assertEquals;

public class Assignment1 {

    public static void main(String[] args) {

        Stream<Integer> stream = Stream.of(1,2,3,4,9,5,6,7,8);

        // A stream can be used only once
        // Create a new stream everytime
        // Search on Google for hints

        // 1 Print each number in the stream
        // 2 Print all the squares of the elements in the stream
        // 3 Print all elements > 5 (use filter method)
        // 4 Add 10 to every element and print the result
        // 5 Create a List of Integers from the stream


        // 6 Use the map method to transform the stream to a stream of Strings and print them
        stream.map( v -> "" + v).forEach(System.out::println);
        // 7 print the maximum number in the stream
        stream = Stream.of(1,2,3,4,9,5,6,7,8);
        // 8 print numbers as a comma separated string: 1,2,3,4,5,6,7,8
        stream = Stream.of(1,2,3,4,9,5,6,7,8);
        Optional<Integer> max = stream.max(Comparator.comparing(Integer::valueOf));
        System.out.println(max.get());


        List<Integer> listOfIntegers = Arrays.asList(1, 2, 3, 4, 56, 7, 89, 10);
        Integer expectedResult = 89;

        // then
        max = listOfIntegers
                .stream()
                .max( Comparator.comparing(Integer::valueOf));

        System.out.println( max.get());




        stream = Stream.of(1,2,3,4,9,5,6,7,8);

        String s = stream
            .map( x -> "" + x)
            .collect(Collectors.joining(","));

        System.out.println( s);

    }
}
