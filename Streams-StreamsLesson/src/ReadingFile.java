import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadingFile {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("plik.txt"));
        scanner.tokens().forEach(System.out::println);
    }
}
