package com.java.stream;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class ProgramForFlatMapInStream {
    static void main() {
        List<List<String>> list = Arrays.asList(
                Arrays.asList("Java", "Spring"),
                Arrays.asList("Hibernate", "MySQL")
        );

        List<String> result = list.stream()
                .flatMap(Collection::stream)
                .collect(Collectors.toList());

        System.out.println(result);
        //In flatMap Nested lists are flattened into a single stream.
    }
}
