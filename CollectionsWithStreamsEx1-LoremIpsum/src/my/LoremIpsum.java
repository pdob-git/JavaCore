package my;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;


public class LoremIpsum {
    private static final String FILE_NAME = "loremipsum-129.txt";

    public static void main(String[] args) {

        System.out.println("MOje rozwiązanie");

        List<String> lines;
        lines = readFile();
        readFile().forEach((System.out::println));

        long startWithSCount = removeDotsAndCommas(splitLines(lines)).filter(LoremIpsum::getStartWithS).count();
        System.out.println("Liczba wyrazów na 's': "  + startWithSCount);

        long count5letterWords = removeDotsAndCommas(splitLines(lines)).filter(LoremIpsum::get5LettersWords).count();
        System.out.println("Liczba wyrazów z 5 literami: " + count5letterWords);

    }

    private static Stream<String[]> splitLines(List<String> stringList) {
        return stringList.stream().map(s -> s.split(" "));
    }

    private static Stream<String> removeDotsAndCommas(Stream<String[]> stream1) {
        return stream1.flatMap(Arrays::stream)
                .map(s -> s.replaceAll("\\.", ""))
                .map(s -> s.replaceAll(",", ""));
    }


    private static List<String> readFile() {
        List<String> linesList = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;

            while ((line = bufferedReader.readLine()) != null) {
                linesList.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return linesList;
    }

    private static boolean get5LettersWords(String s) {
        return s.length() == 5;
    }

    private static boolean getStartWithS(String s) {
        return s.startsWith("s");
    }
}
