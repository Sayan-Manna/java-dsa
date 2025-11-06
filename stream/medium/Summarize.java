package stream.medium;

// Compute summary statistics (count, min, max, avg, sum) for salaries.

import java.util.Arrays;
import java.util.DoubleSummaryStatistics;
import java.util.List;

class Emp {
    double salary;
    Emp(double salary) {
        this.salary = salary;
    }
}

public class Summarize {
    public static void main(String[] args) {
        List<Emp> employees = Arrays.asList(
                new Emp(50000),
                new Emp(60000),
                new Emp(55000),
                new Emp(65000)
        );

        DoubleSummaryStatistics stats = employees.stream()
                .mapToDouble(e -> e.salary)
                .summaryStatistics(); // summaryStatistics() returns a ready-made object with all basic stats.


        System.out.println("Count: " + stats.getCount());
        System.out.println("Min: " + stats.getMin());
        System.out.println("Max: " + stats.getMax());
        System.out.println("Average: " + stats.getAverage());
        System.out.println("Sum: " + stats.getSum());

    }
}
