import java.util.Scanner;

public class Algorithm {
    public static void main(String[] args) {
        int index = 0;
        int multi = 1;
        int next = 0;
        Scanner sc = new Scanner(System.in);
        while (index < 5 ){
            next = sc.nextInt();
            sc.nextLine();
            multi = multi * next;
            index++;
        }

        if (multi >= 0){
            System.out.println("nieujemna");
        } else {
            System.out.println("ujemna");
        }
    }
}
