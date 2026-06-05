package com.java.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NosStartFrOne {
    static void main() {
        List<Integer> nos = Arrays.asList(1,11,85,15,20,16);

        List<String> nosStartFromOne = nos.stream()
                .map(String::valueOf)
                .filter(n -> n.startsWith("1"))
                .collect(Collectors.toList());
        System.out.println(nosStartFromOne);
    }
}
