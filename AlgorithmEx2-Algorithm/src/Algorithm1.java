import java.util.Scanner;

//Algorithm 1 after refactor
public class Algorithm1 {
    public static void main(String[] args) {
        int multi = getMulti();
        printPositiveOrNegative(multi);
    }

    private static void printPositiveOrNegative(int multi) {
        if (multi >= 0) {
            System.out.println("Nieujemna");
        } else {
            System.out.println("Ujemna");
        }
    }

    private static int getMulti() {
        int multi = 1;
        Scanner sc = new Scanner(System.in);
        for (int index = 0; index < 5; index++) {
            int next = sc.nextInt();
            sc.nextLine();
            multi = multi * next;
        }
        return multi;
    }
}
