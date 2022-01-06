package page;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class SimpleStringComparator {
    public static void main(String[] args) {
        System.out.println("Rozwiązanie z kursu");
        List<String> names = Arrays.asList("Karol", "Wojtek", "Alicja", "Bartek", "Romek");

        Collections.sort(names, String::compareToIgnoreCase);

        for (String name : names) {
            System.out.println(name);
        }
    }
}