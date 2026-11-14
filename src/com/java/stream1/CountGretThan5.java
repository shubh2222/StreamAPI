package com.java.stream1;

import java.util.Arrays;
import java.util.List;

public class CountGretThan5 {
    static void main() {
        List<Integer> nos = Arrays.asList(2,6,3,8,10,1);
        long count = nos.stream()
                .filter(n -> n > 5)
                .count();
        System.out.println(count);

    }
}
