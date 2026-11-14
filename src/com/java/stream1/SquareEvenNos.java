package com.java.stream1;

import java.util.Arrays;
import java.util.List;

public class SquareEvenNos {
    static void main() {
        List<Integer> nos = Arrays.asList(1,2,3,4,5,6);
        List<Integer> sqEvenNos = nos.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n*n)
                .toList();
        System.out.println(sqEvenNos);
    }
}
