package com.java.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseEachWord {
    static void main() {
        List<String> words = Arrays.asList("Shree", "Sonu", "Atharva", "Rudra");

        List<String> reversedWords = words.stream()
                .map(word -> new StringBuilder(word).reverse().toString())
                .collect(Collectors.toList());

        System.out.println(reversedWords);

    }
}
