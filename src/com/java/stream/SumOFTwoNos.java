package com.java.stream;

import java.util.Arrays;
import java.util.List;

public class SumOFTwoNos {
    static void main() {
        List<Integer> nosList = Arrays.asList(1,2);

        int sum = nosList.stream()
                .reduce(0, Integer::sum);
        System.out.println(sum);
    }
}
