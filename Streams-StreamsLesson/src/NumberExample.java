import java.util.Arrays;
import java.util.stream.IntStream;

//Example of filtering even numbers

class NumberExample {
    public static void main(String[] args) {
        IntStream stream = IntStream.of(1, 2, 3, 4, 5);
        IntStream intStreamFiltered = stream.filter(x -> x % 2 == 0);
        int[] evenNumbers = intStreamFiltered.toArray();
        System.out.println(Arrays.toString(evenNumbers));
    }
}