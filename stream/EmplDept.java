package stream;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmplDept {
    public static void main(String[] args) {

        List<Employeee> list = List.of(
                new Employeee("IT"),
                new Employeee("HR"),
                new Employeee("IT")
        );

        // Group Employees by dept
        Map<String, List<Employeee>> map = list.stream()
                .collect(Collectors.groupingBy(Employeee::getDept));


        // Count Employees in each dept

        // Avg salary by dept


        System.out.println(map);


    }
}
class Employeee {

    String dept;


    Employeee(String dept) {
        this.dept = dept;
    }
    String getDept() {
        return dept;
    }
}