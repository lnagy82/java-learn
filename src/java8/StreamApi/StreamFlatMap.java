package java8.StreamApi;

import java.util.Arrays;
import java.util.List;

class Student {
    String name;
    List<String> subjects;

    Student(String name, List<String> subjects) {
        this.name = name;
        this.subjects = subjects;
    }
}

public class StreamFlatMap {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
            new Student("Anna", Arrays.asList("Math", "Physics")),
            new Student("Béla", Arrays.asList("Biology", "Chemistry")),
            new Student("Cecil", Arrays.asList("Math", "Biology"))
        );

        students.stream()
            .flatMap(student -> student.subjects.stream())
            .distinct()
            .forEach(System.out::println);
    }
}
