package com.java.stream;

import java.util.Arrays;
import java.util.List;

public class SecondHighestNoFrStream {
    static void main() {
        List<Integer> numbers = Arrays.asList(12,20,30,50,20,40);

//        Optional<Integer> secHighNo = numbers.stream().distinct()
//                .sorted(Collections.reverseOrder())
//                .skip(1)
//                .findFirst();
              //  .forEach(System.out::println);
       // System.out.println("Sec Highest No is: "+secHighNo);

        Integer secHighNo = numbers.stream().distinct()
                .sorted((a, b) -> b - a)
                .skip(1)
                .findFirst()
                .orElse(0);
        System.out.println("Sec Highest No is: "+secHighNo);

    }
}
