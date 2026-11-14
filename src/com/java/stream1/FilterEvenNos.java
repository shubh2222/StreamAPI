package com.java.stream1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterEvenNos {
    static void main() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        List<Integer> evenNos = numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        System.out.println(evenNos);
    }
}
