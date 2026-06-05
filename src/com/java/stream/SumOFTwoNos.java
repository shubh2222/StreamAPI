package com.java.stream;

import java.util.Arrays;
import java.util.List;

public class SumOFTwoNos {
    static void main() {
        List<Integer> nosList = Arrays.asList(1,2);

        int sum = nosList.stream()
                .reduce(0,(a,b)-> a+b);
        System.out.println(sum);
    }
}
