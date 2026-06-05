package com.java.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ConversionOfListToMap {
    static void main() {
        List<String> words = Arrays.asList("Shree", "Sonu", "Atharva", "Rudra");

        Map<String, Integer> map = words.stream()
                .collect(Collectors.toMap(
                        word -> word,
                        word -> word.length()
                ));

        System.out.println(map);
    }
}
