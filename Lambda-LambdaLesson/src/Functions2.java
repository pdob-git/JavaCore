import java.util.function.Consumer;

class Functions2 {
    public static void main(String[] args) {
        Consumer<String> print3Times = s -> {
            System.out.println(s);
            System.out.println(s);
            System.out.println(s);
        };

        print3Times.accept("abc");
        print3Times.accept("xxx");
    }
}