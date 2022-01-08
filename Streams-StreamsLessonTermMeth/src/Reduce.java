import java.util.stream.Stream;

//Reduce method let return single result from stream. Sum, String etc.
public class Reduce {
    public static void main(String[] args) {
        Stream<String> names = Stream.of("Ania", "Kasia", "Basia");
        String allNames = names.reduce("", (result, next) -> result + next + " ");
        System.out.println(allNames); //Ania Kasia Basia
    }
}
