package page;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class ListOfNumbers {
    public static void main(String[] args) {
        System.out.println("Rozwiązanie z kursu");
        List<Integer> numbers = readNumbersFromUser();
        showStats(numbers);
    }

    private static List<Integer> readNumbersFromUser() {
        List<Integer> numbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int next = 0;
        boolean numberIsCorrect = true;

        while(numberIsCorrect) {
            System.out.println("Podaj kolejną liczbę nieujemną, podzielną przez 5");
            next = scanner.nextInt();
            if (next >= 0 && next % 5 == 0) {
                numbers.add(next);
            } else {
                numberIsCorrect = false;
            }
        }
        return numbers;
    }

    private static void showStats(List<Integer> numbers) {
        int sum = sumNumbers(numbers);
        double avg = ((double)sum) / numbers.size();

        System.out.println("Ile poprawnych liczb: " + numbers.size());
        System.out.println("Ich suma wynosi: " + sum);
        System.out.println("Natomiast średnia to: " + avg);
    }

    private static int sumNumbers(List<Integer> numbers) {
        int sum = 0;
        for (Integer number : numbers) {
            sum += number;
        }
        return sum;
    }
}