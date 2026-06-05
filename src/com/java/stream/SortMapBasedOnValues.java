package com.java.stream;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortMapBasedOnValues {
    static void main() {
        Map<String, Integer> map = new HashMap<>();

        map.put("A", 50);
        map.put("B", 20);
        map.put("C", 40);
        map.put("D", 10);

        Map<String, Integer> sortedMap = map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1, e2) -> e1,
                        LinkedHashMap::new
                ));

        System.out.println(sortedMap);
    }
}
