import java.util.function.Predicate;

class Functions3 {
    public static void main(String[] args) {
        int personAge = 19;
        Predicate<Integer> checkIfAdult = age -> age >= 18;
        if (checkIfAdult.test(personAge)) {
            System.out.println("Print if personAge >= 18");
        } else {
            System.out.println("Print if personAge < 18");
        }
    }
}