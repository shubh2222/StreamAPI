package com.java.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindCommonEleBetTwoLists {
    static void main() {
        List<Integer> nos1 = Arrays.asList(1,2,3,4,5,6);
        List<Integer> nos2 = Arrays.asList(1,2,53,41,55,6);

        List<Integer> commonElements = nos1.stream()
                .filter(nos2::contains)
                .collect(Collectors.toList());

        System.out.println(commonElements);

        List<String> words1 = Arrays.asList("Shree", "Sonu", "Atharva", "Atharv");
        List<String> words2 = Arrays.asList("Shree", "Sonu", "Atharva", "Rudra");

        List<String> commEle = words1.stream()
                .filter(words2::contains)
                .collect(Collectors.toList());
        System.out.println(commEle);
    }
}
