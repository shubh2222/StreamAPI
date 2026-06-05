package com.java.stream;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FreqOfEachCharInStr {
    static void main() {
        String str = "Shubhangi";
        Map<Character, Long> frequency = str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()
                ));

        System.out.println(frequency);
    }
}
