package stream.medium;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

// Convert a list of employees into a Map where key = name, value = salary.
class Employee {
    String name;
    double salary;
    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
}

public class CnvrtToMap {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Sayan", 50000),
                new Employee("Manna", 60000),
                new Employee("Neha", 65000)
        );

        Map<String, Double> salaryMap = employees.stream()
                .collect(Collectors.toMap(
                        e -> e.name, //key
                        e -> e.salary // val
                ));

        System.out.println(salaryMap);

    }
}
