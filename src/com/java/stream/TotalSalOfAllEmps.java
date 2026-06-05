package com.java.stream;

import java.util.Arrays;
import java.util.List;

public class TotalSalOfAllEmps {
    static void main() {
        List<Employee> employeeList = Arrays.asList(
                new Employee(1, "Aditi", 50000, "IT"),
                new Employee(2, "Rahul", 75000, "Finance"),
                new Employee(3, "Sita", 60000, "IT"),
                new Employee(4, "Arjun", 75000, "HR"),
                new Employee(5, "Priya", 45000, "HR")
        );

        double totalSalary = employeeList.stream()
                .map(Employee::getSalary)
                .reduce(0.0, Double::sum);

        System.out.println("Total Salary: " + totalSalary);

    }
}
