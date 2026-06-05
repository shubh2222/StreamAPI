package com.java.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindAllPalindromesFromList {
    static void main() {
        List<String> words = Arrays.asList(
                "madam", "java", "level", "radar", "hello"
        );

        List<String> palindromes = words.stream()
                .filter(word -> word.contentEquals(
                        new StringBuilder(word).reverse()))
                .collect(Collectors.toList());

        System.out.println(palindromes);
    }
}
