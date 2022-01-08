import java.util.Arrays;
import java.util.stream.Stream;

class LetterStream {
    public static void main(String[] args) {
        Stream<String> letters = Stream.of("a", "b", "c");
        String[] upperCaseLetters = letters.map(String::toUpperCase)
                .toArray(String[]::new);
        System.out.println(Arrays.toString(upperCaseLetters));
    }
}