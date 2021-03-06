//Skips certain number of items from the beginning of stream

import java.util.Comparator;
import java.util.stream.Stream;

public class Skip {
    public static void main(String[] args) {
        Stream<Course> courses = Stream.of(
                new Course(1L, "Java", 249, "Programowanie"),
                new Course(2L, "Sztuka pisania", 99, "Rozwój osobisty"),
                new Course(3L, "Tajniki Google", 299, "Marketing"),
                new Course(4L, "Java od podstaw", 159, "Programowanie"),
                new Course(5L, "Python od podstaw", 139, "Programowanie")
        );
        Stream<Course> withoutCheapCourses = courses
                .sorted(Comparator.comparing(Course::getPrice))
                .skip(3);
        withoutCheapCourses.forEach(System.out::println);
    }
}
