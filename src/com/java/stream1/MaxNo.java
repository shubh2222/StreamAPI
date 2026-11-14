package com.java.stream1;

import java.util.Arrays;
import java.util.List;

public class MaxNo {
    static void main() {
        List<Integer> nos = Arrays.asList(5,10,2,8,20);
        Integer maxNo = nos.stream()
                .reduce(0, Integer::max);
        System.out.println(maxNo);

    }
}
