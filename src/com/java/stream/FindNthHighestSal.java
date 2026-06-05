package com.java.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindNthHighestSal {
    static void main() {
        List<Employee> employeeList = Arrays.asList(
                new Employee(1, "Aditi", 50000, "IT"),
                new Employee(2, "Rahul", 75000, "Finance"),
                new Employee(3, "Sita", 60000, "IT"),
                new Employee(4, "Arjun", 75000, "HR"),
                new Employee(5, "Priya", 45000, "HR")
        );

        int n = 3;

            Double nthHighestSalary = employeeList.stream()
                    .map(Employee::getSalary)
                    .distinct()
                    .sorted(Comparator.reverseOrder())
                    .skip(n - 1)
                    .findFirst()
                    .orElse(0.0);

        System.out.println(n + " Highest Salary: " + nthHighestSalary);
    }
}
