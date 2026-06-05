package com.java.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class CheckListIsEmptyUsingOptional {
    static void main() {
        List<Integer> nos = Arrays.asList();

        Optional<List<Integer>> optionalList = Optional.ofNullable(nos);

        if (optionalList.isPresent() && !optionalList.get().isEmpty()) {
            System.out.println("List is not empty");
        } else {
            System.out.println("List is empty");
        }

    }
}
