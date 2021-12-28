import java.io.File;
import java.io.FileNotFoundException;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

//My solution the same a from lesson

public class NameReader {
    public static void main(String[] args) {
        final String fileName = "namespl.txt";
        File file = new File(fileName);
        TreeSet<String> names = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return -s1.compareTo(s2);
            }
        });

        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()){
                names.add(scanner.nextLine());
            }
            System.out.println("Liczba imion w zbiorze: " + names.size());
            System.out.println("Pierwsze imię: " + names.first());
            System.out.println("Ostatnie imię w zbiorze: " + names.last());
        } catch (FileNotFoundException e) {
            System.err.println("Brak pliku " + fileName);
        }
    }
}
