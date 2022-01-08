//Collect example
//        supplier (typu Supplier) - najczęściej referencja do konstruktora kolekcji, w której chcemy umieścić elementy,
//        accumulator (typu BiConsumer) - najczęściej referencja do metody, która pozwala dodawać elementy do kolekcji,
//        combiner (typu BiConsumer) - najczęściej referencja do metody, która pozwala łączyć dwie kolekcje w jedną, wykorzystywana wyłącznie przy wielowątkowym przetwarzaniu strumieni.


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Collect {
    public static void main(String[] args) {

        collect1();
        collect2();
    }

    private static void collect1() {
        Stream<Course> courses = Stream.of(
                new Course(1L, "Java", 199, "Programowanie"),
                new Course(2L, "Sztuka pisania", 99, "Rozwój osobisty"),
                new Course(3L, "Tajniki Google", 299, "Marketing")
        );
        ArrayList<Course> coursesList = courses.collect(
                ArrayList<Course>::new,
                ArrayList::add,
                ArrayList::addAll
        );
        System.out.println(coursesList);
    }

    private static void collect2() {
        Stream<Course> courses = Stream.of(
                new Course(1L, "Java", 199, "Programowanie"),
                new Course(2L, "Sztuka pisania", 99, "Rozwój osobisty"),
                new Course(3L, "Tajniki Google", 299, "Marketing")
        );
        List<Course> coursesList = courses.collect(Collectors.toList());
        System.out.println(coursesList);
    }
}

