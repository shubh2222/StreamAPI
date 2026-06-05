package com.java.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MaxAndMinNo {
    static void main() {
        List<Integer> nos = Arrays.asList(1,2,3,4);

        Integer maxNo = nos.stream()
                .max(Integer::compare)
                .get();
        System.out.println(maxNo);

        Integer minNo = nos.stream()
                .min(Integer::compare)
                .get();
        System.out.println(minNo);
    }
}
