//Methods anyMatch(), allMatch(), noneMatch()

import java.util.stream.Stream;

public class Match {
    public static void main(String[] args) {
        anyMatch();
        allMatch();
        noneMatch();
    }

    private static void anyMatch() {
        Stream<Course> courses = Stream.of(
                new Course(1L, "Java", 199, "Programowanie"),
                new Course(2L, "Sztuka pisania", 99, "Rozwój osobisty"),
                new Course(3L, "Tajniki Google", 299, "Marketing")
        );
        boolean under100 = courses.anyMatch(course -> course.getPrice() < 100);
        if (under100)
            System.out.println("Co najmniej jeden z kursów jest tańszy niż 100zł");
    }

    private static void allMatch() {
        Stream<Course> courses = Stream.of(
                new Course(1L, "Java", 199, "Programowanie"),
                new Course(2L, "Sztuka pisania", 99, "Rozwój osobisty"),
                new Course(3L, "Tajniki Google", 299, "Marketing")
        );
        boolean above10 = courses.allMatch(course -> course.getPrice() > 10);
        if (above10)
            System.out.println("Wszystkie kursy są droższe od 10zł");
    }

    private static void noneMatch() {
        Stream<Course> courses = Stream.of(
                new Course(1L, "Java", 199, "Programowanie"),
                new Course(2L, "Sztuka pisania", 99, "Rozwój osobisty"),
                new Course(3L, "Tajniki Google", 299, "Marketing")
        );
        boolean above300 = courses.noneMatch(course -> course.getPrice() > 300);
        if(above300)
            System.out.println("Żaden z kursów nie jest droższy od 300zł");
    }
}
