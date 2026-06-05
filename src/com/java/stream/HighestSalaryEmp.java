package com.java.stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class HighestSalaryEmp {
    static void main() {
        List<Employee> employeeList = Arrays.asList(
                new Employee(1, "Aditi", 50000, "IT"),
                new Employee(2, "Rahul", 75000, "Finance"),
                new Employee(3, "Sita", 60000, "IT"),
                new Employee(4, "Arjun", 75000, "HR"),
                new Employee(5, "Priya", 45000, "HR")
        );

        Double highSal = employeeList.stream()
                .map(Employee::getSalary)
                .sorted(Collections.reverseOrder())
                .distinct()
                .findFirst()
                .get();

        System.out.println("Highest Salary is: "+highSal);

        Employee highestSalEmp = employeeList.stream()
                .max(Comparator.comparing(Employee::getSalary))
                .get();
        System.out.println("Highest Salary Employee is: "+ highestSalEmp.getName()+ " : "+highestSalEmp.getSalary());
    }
}
