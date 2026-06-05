package com.java.stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindDuplicateEleFrList {
    static void main() {
        List<String> employeeList = Arrays.asList(
                "Amit", "Rahul", "Amit", "Sneha", "Rahul"
        );

        employeeList.stream()
                .filter(name -> Collections.frequency(employeeList, name) > 1)
                .distinct()
                .forEach(System.out::println);
    }
}
