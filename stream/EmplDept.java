package stream;

import java.util.List;

public class EmplDept {
    public static void main(String[] args) {

        List<Employeee> list = List.of(
                new Employeee("IT"),
                new Employeee("HR"),
                new Employeee("IT")
        );

        // Group Employees by dept


        // Count Employees in each dept

        // Avg salary by dept


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