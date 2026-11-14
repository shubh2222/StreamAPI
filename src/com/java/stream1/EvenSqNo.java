package com.java.stream1;
import java.util.Arrays;
import java.util.List;

public class EvenSqNo {
    static void main() {
        List<Integer> nos = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        Integer sum = nos.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n*n)
                .reduce(0, Integer::sum);
        System.out.println(sum);
    }
}
