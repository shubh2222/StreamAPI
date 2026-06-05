package com.java.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CountEmpsInEachDept {
    static void main() {
        List<Employee> employeeList = Arrays.asList(
                new Employee(1, "Aditi", 50000, "IT"),
                new Employee(2, "Rahul", 75000, "Finance"),
                new Employee(3, "Sita", 60000, "IT"),
                new Employee(4, "Arjun", 75000, "HR"),
                new Employee(5, "Priya", 45000, "HR")
        );

        Map<String, Long> ctOfEmp = employeeList.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDept,
                        Collectors.counting()
                ));

        System.out.println(ctOfEmp);
    }
}
