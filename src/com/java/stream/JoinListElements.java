package com.java.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JoinListElements {
    static void main() {
        List<String> names = Arrays.asList("Shree", "Sonu", "Atharva", "Rudra");

        String result = names.stream()
                .collect(Collectors.joining(", "));

        System.out.println(result);
    }
}
