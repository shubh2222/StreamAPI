package com.java.stream1;

import java.util.Arrays;
import java.util.List;

public class SumEvenNos {
    static void main() {
        List<Integer> nos = Arrays.asList(1,2,3,4,5);
        Integer sum = nos.stream()
                .filter(n -> n%2 == 0)
                .reduce(0, Integer::sum);
        System.out.println(sum);
    }
}
