package my;

import java.util.*;

public class SimpleStringComparator {
    public static void main(String[] args) {
        System.out.println("Moje rozwiązanie");
        List<String> stringList = new ArrayList<>(Arrays.asList("Karol", "Wojtek", "Alicja", "Bartek", "Romek"));
        Collections.sort(stringList, String::compareToIgnoreCase);
        System.out.println(stringList);
    }
}
