import java.util.*;
import java.util.stream.Collectors;
class Student {
    String name;
    String grade;
    Student(String name, String grade) {
        this.name = name;
        this.grade = grade;
    }
}
public class StudentGrouping {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("Muskan", "A"),
                new Student("Mskn", "B"),
                new Student("Muskann", "A"),
                new Student("Muskaan", "C"),
                new Student("Musskan", "B")
        );
        Map<String, List<String>> groupedByGrade = students.stream()
                .collect(Collectors.groupingBy(
                        s -> s.grade,
                        Collectors.mapping(s -> s.name, Collectors.toList())
                ));
        System.out.println("Students grouped by grade:");
        groupedByGrade.forEach((grade, names) ->
                System.out.println("Grade " + grade + ": " + names));
    }
}