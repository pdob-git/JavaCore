public class CalcTest {
    public static void main(String[] args) {
        int a = 10;
        int b = 4;
        int c = 2;

        Calculator calculator = new Calculator();
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("a + b = " + calculator.add(a, b));
        System.out.println("a + b + c = " + calculator.add(a, b, c));

        System.out.println("a - b = " + calculator.subtract(a, b));
        System.out.println("a - b - c = " + calculator.subtract(a, b, c));
    }
}
