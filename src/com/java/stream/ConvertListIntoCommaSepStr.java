package com.java.stream;

import java.util.Arrays;
import java.util.List;

public class ConvertListIntoCommaSepStr {
    static void main() {
        List<String> names = Arrays.asList("Shree", "Sonu", "Atharva", "Rudra");

        String result = String.join(", ", names);
        System.out.println(result);
    }
}
