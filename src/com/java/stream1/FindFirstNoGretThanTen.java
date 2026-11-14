package com.java.stream1;

import java.util.Arrays;
import java.util.List;

public class FindFirstNoGretThanTen {
    static void main() {
        List<Integer> nos = Arrays.asList(3,7,12,5,11,20);
        List<Integer> gretNo = nos.stream()
                .filter(n -> n > 10)
                .sorted()
                .findFirst()
                .stream().toList();
        System.out.println(gretNo);
    }
}
