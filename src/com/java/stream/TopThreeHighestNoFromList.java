package com.java.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TopThreeHighestNoFromList {
    static void main() {
        List<Integer> nos = Arrays.asList(1,2,3,4,5,6);

        List<Integer> top3 = nos.stream()
                .sorted((a, b) -> b - a)
                .limit(3)
                .collect(Collectors.toList());

        System.out.println(top3);
    }
}
