import java.util.Scanner;

class CheckSum1 {
    public static void main(String[] args) {
        int sum = 0;
        int next = 0;
        Scanner scanner = new Scanner(System.in);
        while((next = scanner.nextInt()) <= 100) {
            sum += next;
        }

        int mod = sum % 2;
        if(mod == 0) {
            System.out.println("Parzysta");
        } else {
            System.out.println("Nieparzysta");
        }
    }
}