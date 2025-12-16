package stream;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.OptionalInt;

// Find the average salary of employees.

public class AvgMinMax {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Sayan", 50000),
                new Employee("Manna", 60000),
                new Employee("Raj", 55000)
        );

        double avgSal = employees.stream()
                .mapToDouble(e -> e.salary)
                .average()
                .orElse(0.0);

        OptionalInt highestSal = employees.stream()
                        .mapToInt(e ->  (int) e.salary)
                        .max();

        int secondHighestSal = employees.stream()
                        .mapToInt(e -> (int) e.salary)
                        .boxed() // Since IntStream.sorted() doesn't accept comparator
                        .distinct()
                        .sorted((a,b)->b-a) // Instream.sorted() doesn't accept comparator -> only natural order sorted()
                        .skip(1)
                        .findFirst()
                        .orElse(0);

        System.out.println(avgSal);
        System.out.println(highestSal.orElse(0));
        System.out.println(secondHighestSal);
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
