package com.java.stream;

import java.util.Arrays;
import java.util.List;

public class ConvertListToIntOfArr {
    static void main() {
        List<Integer> nos = Arrays.asList(1, 2, 3, 4);

        int[] arr = nos.stream()
                .mapToInt(Integer::intValue)
                .toArray();

        System.out.println(Arrays.toString(arr));
    }
}
