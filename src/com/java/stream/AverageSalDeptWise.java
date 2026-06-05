package com.java.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//Find Out department wise AVG SALARY

public class AverageSalDeptWise {
    static void main() {
        List<Employee> employeeList = Arrays.asList(
                new Employee(1, "Aditi", 50000, "IT"),
                new Employee(2, "Rahul", 75000, "Finance"),
                new Employee(3, "Sita", 60000, "IT"),
                new Employee(4, "Arjun", 75000, "HR"),
                new Employee(5, "Priya", 45000, "HR")
        );


        //dept wise avg sal
        Map<String, Double> avgSalaryByDept = employeeList.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDept,
                        Collectors.averagingDouble(Employee::getSalary)
                ));

        //overall avg sal
        double avgSalary = employeeList.stream()
                .mapToDouble(Employee::getSalary)
                .average()
                .getAsDouble();

        System.out.println(avgSalaryByDept);
        System.out.println(avgSalary);
    }
}
