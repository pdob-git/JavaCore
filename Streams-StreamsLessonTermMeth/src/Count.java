//Count terminal method example
//Min and Max terminal method example

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Stream;

public class Count {
    public static void main(String[] args) {
        Stream<Course> courses = Stream.of(
                new Course(1L, "Java", 199, "Programowanie"),
                new Course(2L, "Sztuka pisania", 99, "Rozwój osobisty"),
                new Course(3L, "Tajniki Google", 299, "Marketing")
        );
        long streamSize = courses.count();
        System.out.println(streamSize);

        Stream<Course> courses1 = Stream.of(
                new Course(1L, "Java", 199, "Programowanie"),
                new Course(2L, "Sztuka pisania", 99, "Rozwój osobisty"),
                new Course(3L, "Tajniki Google", 299, "Marketing")
        );

        Optional<Course> cheapestCourse = courses1.min((c1, c2) -> Double.compare(c1.getPrice(), c2.getPrice()));
        cheapestCourse.ifPresent(System.out::println);

        Stream<Course> courses2 = Stream.of(
                new Course(1L, "Java", 199, "Programowanie"),
                new Course(2L, "Sztuka pisania", 99, "Rozwój osobisty"),
                new Course(3L, "Tajniki Google", 299, "Marketing")
        );

        //Max
        courses2.max(Comparator.comparingDouble(Course::getPrice))
                .ifPresent(System.out::println);

    }
}
