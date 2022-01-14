import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//Peek show data from stream between operations
public class Peek {
    public static void main(String[] args) {
        Stream<Course> courses = Stream.of(
                new Course(1L, "Java", 249, "Programowanie"),
                new Course(2L, "Sztuka pisania", 99, "Rozwój osobisty"),
                new Course(3L, "Tajniki Google", 299, "Marketing"),
                new Course(4L, "Java od podstaw", 159, "Programowanie")
        );
        List<String> javaTitles = courses
                .filter(c -> c.getName().toLowerCase().contains("java"))
                .peek(course -> System.out.println("filtered stream: " + course))
                .map(Course::getName)
                .collect(Collectors.toList());
        System.out.println(javaTitles);
    }
}
