package com.java.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListOfStrIntoUppCase {
    static void main() {
        List<String> emps = Arrays.asList("Atharva, Shubhangi, Shree");

        List<String> upperCaseEmps = emps.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(upperCaseEmps);
    }
}
