package com.java.stream;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MergeTwoUnsortedArraysIntoSingleSortedArray {
    static void main() {
        int[] arr1 = {5, 2, 8, 1};
        int[] arr2 = {7, 3, 6, 4};

        int[] sortedArray = IntStream.concat(
                        Arrays.stream(arr1),
                        Arrays.stream(arr2))
                .sorted()
                .toArray();

        System.out.println(Arrays.toString(sortedArray));
    }
}
