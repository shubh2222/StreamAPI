package com.java.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LongestAndShortesStrFromList {
    static void main() {
        List<String> words = Arrays.asList("Shree", "Sonu", "Atharva", "Rudra");
        String longestStr = words.stream()
                .max(Comparator.comparing(String::length))
                .get();
        System.out.println("Longest String is: "+longestStr);

        String shortestStr = words.stream()
                .min(Comparator.comparing(String::length))
                .get();
        System.out.println("Shortest String is: "+shortestStr);
    }
}
