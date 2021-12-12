public class PairTest {
    public static void main(String[] args) {

        Pair<String, Integer> pair1 = new Pair<>("Ania", 1987);
        Pair<Double, Double> pair2 = new Pair<>(20.5, 31.7);
        Pair<String, String> pair3 = new Pair<>("Jan", "Kowalski");
        System.out.println(pair1);
        System.out.println(pair2);
        System.out.println(pair3);

    }
}
