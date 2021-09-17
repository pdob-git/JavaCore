public class Calculate {
    public static void main(String[] args) {
        double a = 5;
        double b = 4;
        double addResult;
        double subtractResult;
        double multiplyResult;
        double divideResult;

        Calculator calculator = new Calculator();
        addResult = calculator.add(a, b);
        subtractResult = calculator.subtract(a, b);
        multiplyResult = calculator.multiply(a, b);
        divideResult = calculator.divide(a, b);

        System.out.println("Kalkulator");
        System.out.println(a + " + " + b + " = " + addResult);
        System.out.println(a + " - " + b + " = " + subtractResult);
        System.out.println(a + " * " + b + " = " + multiplyResult);
        System.out.println(a + " / " + b + " = " + divideResult);

    }
}
