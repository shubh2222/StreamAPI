package com.java.stream;

import java.util.List;
import java.util.Optional;

public class CheckListIsEmptyUsingOptional {
    static void main() {
        List<Integer> nos = List.of();

        Optional<List<Integer>> optionalList = Optional.of(nos);

        if (!optionalList.get().isEmpty()) {
            System.out.println("List is not empty");
        } else {
            System.out.println("List is empty");
        }

    }
}
