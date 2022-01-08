import java.util.Arrays;
import java.util.stream.IntStream;

public class IntStreamGenerator {
    public static void main(String[] args) {
        IntStream numStream = IntStream.iterate(0, x -> x + 1);
        IntStream limitedStream = numStream.limit(100);
        int[] numbers = limitedStream.toArray();
        System.out.println(Arrays.toString(numbers));

        //Even Squares

        int[] squares = IntStream.iterate(0, x -> x + 1)
                .limit(100)
                .map(x -> x * x)
                .filter(x -> x % 2 == 0)
                .toArray();
        System.out.println(Arrays.toString(squares));
    }
}
