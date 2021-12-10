public class Factorial {
    public static void main(String[] args) {
        int number = 5;
        int factorialResult = factorialTernaryOperator(number);
        System.out.println("Silnia " + number + " = " + factorialResult);
    }

    private static int factorial(int number) {
        int result = 0;
        if (number > 0) {
            result = number * factorial(number - 1);
        } else if (number == 0) {
            result = 1;
        }
        return result;
    }

//    Factional (silnia) with Ternary Operator Example
//    [condition] ?  [vaue if true] : [value if false]
    static int factorialTernaryOperator(int n) {
        return n > 0 ? n * factorialTernaryOperator(n - 1) : 1;
    }

}
