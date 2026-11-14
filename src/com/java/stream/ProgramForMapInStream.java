package com.java.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ProgramForMapInStream {
    static void main() {
        List<String> names = Arrays.asList("shubhangi", "java", "spring");

        List<String> upperCaseNames = names.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println(upperCaseNames);

        //In map Each input element produces exactly one output element.
    }
}
