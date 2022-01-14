import java.util.stream.IntStream;

//Show first 10 numbers from 100 to 1000, which are divided by 5
//multiplied by 3

public class StreamsEx1 {
    public static void main(String[] args) {
        IntStream.iterate(0, i -> i + 1)
                .filter(x -> x > 100 && x < 1000 && x % 5 == 0)
                .limit(10)
                .map(x -> x * 3)
                .forEach(System.out::println);
    }
}
