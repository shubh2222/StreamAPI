package com.java.stream;

import java.util.function.Function;
import java.util.stream.Collectors;

public class FindDuplicateCharsFromString {
    static void main() {
        String str = "Shubhangi";

         str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()
                ))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() > 1)
                .forEach(entry ->
                        System.out.println(entry.getKey() + " -> " + entry.getValue()));
    }
}
