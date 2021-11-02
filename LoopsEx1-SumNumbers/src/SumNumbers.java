import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj ile liczb sumować");
        int numbers = input.nextInt();
        input.nextLine();
        int counter = 0;
        int sum = 0;
        while (counter!=numbers){
            System.out.println("Podaj liczbę nr " + (counter +1));
            sum += input.nextInt();
            input.nextLine();
            counter++;
        }
        System.out.println("Wynik sumy cyfr: " + sum);
        input.close();
    }
}
