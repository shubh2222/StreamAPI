package com.java.stream1;

import java.util.Arrays;
import java.util.List;

public class SquareNos {
    static void main() {
        List<Integer> nos = Arrays.asList(1,2,3,4,5);
        List<Integer> sqNos = nos.stream()
                .map(n-> n*n)
                .toList();
        System.out.println(sqNos);
    }
}
