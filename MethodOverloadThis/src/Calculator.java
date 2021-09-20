public class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return this.add(a, b) + c;
    }

    int subtract(int a, int b) {
        return a - b;
    }

    int subtract(int a, int b, int c) {
        return this.subtract(a, b) - c;
    }

}
