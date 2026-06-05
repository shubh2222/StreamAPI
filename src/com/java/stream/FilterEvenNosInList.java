package com.java.stream;

import java.util.Arrays;
import java.util.List;

public class FilterEvenNosInList {
    static void main() {
        List<Integer> nos = Arrays.asList(1,2,3,4,5,6);

        List<Integer> evenNos = nos.stream()
                .filter(n -> n % 2 == 0)
                .toList();
        System.out.println(evenNos);

        List<Integer> oddNos = nos.stream()
                .filter(n -> n % 2 != 0)
                .toList();
        System.out.println(oddNos);
    }
}
