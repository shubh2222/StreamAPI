package com.java.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountOfOccOfNosValuesInMAp {
    static void main() {
        List<Integer> nos = Arrays.asList(1,2,3,1,2,4);

        Map<Integer, Long> res = nos.stream()
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()));

        for(Map.Entry<Integer,Long> entrySet : res.entrySet()){
            System.out.println(entrySet);
        }
    }
}
