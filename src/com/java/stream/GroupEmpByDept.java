package com.java.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupEmpByDept {
    static void main() {
        List<Employee> employeeList = Arrays.asList(
                new Employee(1, "Aditi", 50000, "IT"),
                new Employee(2, "Rahul", 75000, "Finance"),
                new Employee(3, "Sita", 60000, "IT"),
                new Employee(4, "Arjun", 75000, "HR"),
                new Employee(5, "Priya", 45000, "HR")
        );

        Map<String, List<Employee>> grpEmpByDept = employeeList.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDept
                ));

        grpEmpByDept.forEach((dept, employees) -> System.out.println(dept + " -> " + employees));    }
}
