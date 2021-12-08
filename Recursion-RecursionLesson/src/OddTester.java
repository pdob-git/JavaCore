class OddTester {
    public static void main(String[] args) {
        checkNumber(10);
        checkNumber(11);
    }

    static void checkNumber(int n) {
        String check = n % 2 == 0 ? "Parzysta" : "Nieparzysta";
        System.out.println(n + " " + check);
    }
}