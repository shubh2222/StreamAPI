package com.java.stream;

import java.util.Arrays;
import java.util.List;

public class SkipFirstFiveElements {
    static void main() {
        List<Integer> nos = Arrays.asList(1,2,3,4,5,6);

        List<Integer> skippedList = nos.stream()
                .skip(5)
                .toList();
        System.out.println(skippedList);
    }
}
