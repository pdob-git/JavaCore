class NumberAdderRecursion {
    public static void main(String[] args) {
        int number = sum(3);
        int number1 = sumConditionalOperator(3);
        System.out.println(number);
        System.out.println("Conditional Operator:");
        System.out.println(number1);
    }

    static int sumConditionalOperator(int n) {
        return n > 1 ? n + sum(n - 1) : n;
    }

    static int sum(int n) {
        if (n > 1) {
            System.out.println(n + "+" + "sum(" + (n - 1) + ")");
            return n + sum(n - 1);
        } else {
            return n;
        }
    }
}