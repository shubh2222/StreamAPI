package com.java.stream;

import java.util.Arrays;
import java.util.List;

public class EmpSalGretThanAvgSal {
    static void main() {
        List<Employee> employeeList = Arrays.asList(
                new Employee(1, "Aditi", 50000, "IT"),
                new Employee(2, "Rahul", 75000, "Finance"),
                new Employee(3, "Sita", 60000, "IT"),
                new Employee(4, "Arjun", 75000, "HR"),
                new Employee(5, "Priya", 45000, "HR")
        );

        double avgSalary = employeeList.stream()
                .mapToDouble(Employee::getSalary)
                .average()
                .orElse(0.0);

        List<String> employeeNames = employeeList.stream()
                .filter(emp -> emp.getSalary() > avgSalary)
                .map(Employee::getName)
                .toList();

        System.out.println("Average Salary: " + avgSalary);
        System.out.println("Employees with salary greater than average: " + employeeNames);

    }
}
