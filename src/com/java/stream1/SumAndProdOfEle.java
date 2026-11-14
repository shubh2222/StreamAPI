package com.java.stream1;

import java.util.Arrays;
import java.util.List;

public class SumAndProdOfEle {
    static void main() {
        List<Integer> nos = Arrays.asList(1,2,3,4,5);
        //sum
        Integer sum = nos.stream()
                .reduce(0, Integer::sum);
        System.out.println(sum);

        //Product
        Integer prod = nos.stream()
                .reduce(1,(a,b) -> a*b);
        System.out.println(prod);
    }
}
