import java.util.Arrays;
import java.util.stream.Stream;

//Returns a stream consisting of the results of replacing each element of this stream with the contents of a mapped stream
public class FilterMap {
    public static void main(String[] args) {
        Course[] cheapCourses = {
                new Course(1L, "Java", 49, "Programowanie"),
                new Course(2L, "Sztuka pisania", 79, "Rozwój osobisty"),
        };
        Course[] expensiveCourses = {
                new Course(3L, "Tajniki Google", 299, "Marketing"),
                new Course(4L, "Python od podstaw", 169, "Programowanie")
        };
        Stream<Course[]> courses = Stream.of(
                cheapCourses,
                expensiveCourses
        );
        Stream<Course> allCourses = courses.flatMap(Arrays::stream);
        allCourses.forEach(System.out::println);
    }
}
