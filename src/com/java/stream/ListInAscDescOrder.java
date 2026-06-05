package com.java.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListInAscDescOrder {
    static void main() {
         List<Integer> nos = Arrays.asList(1,2,3,7,9,8,4,5,6);

        List<Integer> ascOrder = nos.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println("Asc Order: "+ascOrder);

        List<Integer> descOrder = nos.stream()
                .sorted()
                .toList().reversed();
        System.out.println("Desc Order: "+descOrder);
    }
}
