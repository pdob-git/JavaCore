import java.util.Locale;
import java.util.Scanner;

public class CalcApp {
    public static void main(String[] args) {
        double a;
        double b;
        String operator;
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        Calculator calculator = new Calculator();
        System.out.println("Podaj pierwszą liczbę");
        a = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Podaj operator");
        operator = scanner.nextLine();
        System.out.println("Podaj drugą liczbę");
        b = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("A = " + a);
        System.out.println("Operator = " + operator);
        System.out.println("B = " + b);
        System.out.print("Rezultat " + a + " " + operator + " " + b + " = ");
        System.out.println(calculator.calculateResult(a,b,operator));

        //close scanner at end
        scanner.close();
    }
}
