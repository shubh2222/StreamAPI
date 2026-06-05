package com.java.stream;

public class Employee {
    private final int id;
    private final String name;
    private final double salary;
    private final String dept;


    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public String getDept() {
        return dept;
    }

    public Employee(int id, String name, double salary, String dept) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", dept='" + dept + '\'' +
                '}';
    }
}
