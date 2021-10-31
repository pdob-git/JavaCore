public class Calculator {

    double add(double a, double b) {
        return a + b;
    }

    double subtract(double a, double b) {
        return a - b;
    }

    double multiply(double a, double b) {
        return a * b;
    }

    double divide(double a, double b) {
        return a / b;
    }

    double calculateResult (double a, double b, String operator){
        double result;

        switch (operator){
            case "+":
                result = add(a,b);
                break;
            case "-":
                result = subtract(a,b);
                break;
            case "*":
                result = multiply(a,b);
                break;
            case "/":
                result = divide(a,b);
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + operator);
        }

        return result;
    }

}
