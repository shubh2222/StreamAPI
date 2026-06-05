package com.java.stream;

import java.util.Arrays;
import java.util.List;

public class SumOfAllNosUsingReduce {
    static void main() {
        List<Integer> nos = Arrays.asList(1,2,3,4);

        int sum = nos.stream()
                .reduce(0, Integer::sum);
        System.out.println(sum);
    }
}
