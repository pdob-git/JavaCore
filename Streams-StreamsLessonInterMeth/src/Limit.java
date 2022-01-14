import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

//Limits steram to specified number of items

public class Limit {
    public static void main(String[] args) {
        List<Integer> collect = IntStream.iterate(0, n -> n+1)
                .limit(100)
                .boxed()
                .collect(Collectors.toList());
        System.out.println(collect);
    }
}
