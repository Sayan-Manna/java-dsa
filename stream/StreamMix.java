package stream;


// From a list of people, get names of those older than 25, sort by age descending, and collect names.

import java.util.Arrays;
import java.util.List;

public class StreamMix {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Sayan", 24),
                new Person("Manna", 30),
                new Person("Neha", 28),
                new Person("Raj", 22)
        );

        List<String> names = people.stream()
                .filter(p->p.age>25)
                .sorted((p1,p2) -> Integer.compare(p2.age, p1.age))
                .map(p->p.name)
                .toList();

        System.out.println(names);

    }
}

class Person {
    String name;
    int age;
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
