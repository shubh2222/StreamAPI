package com.java.stream;

import java.util.Arrays;
import java.util.List;

public class removeDupliFrList {
    static void main() {
        List<String> employeeList = Arrays.asList(
                "Amit", "Rahul", "Amit", "Sneha", "Rahul"
        );

        employeeList.stream()
                .distinct()
                .forEach(System.out::println);
    }
}
