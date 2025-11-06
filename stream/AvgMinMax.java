package stream;

import java.util.Arrays;
import java.util.List;

// Find the average salary of employees.

public class AvgMinMax {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Sayan", 50000),
                new Employee("Manna", 60000),
                new Employee("Raj", 55000)
        );

        double avgSal = employees.stream()
                .map(emp -> emp.salary)
                .mapToDouble(sal -> sal)
                .average()
                .orElse(0.0);

        System.out.println(avgSal);

    }
}

class Employee {
    String name;
    double salary;
    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
}
