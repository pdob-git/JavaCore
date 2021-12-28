package my;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListOfNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        getNumbers(numbers);
        showResults(numbers);
    }

    private static void getNumbers( List<Integer> numbers) {
        System.out.println("Moje Rozwiązanie");
        Scanner scanner = new Scanner(System.in);
        String inputString;
        boolean numberIsCorrect = true;
        do {
            System.out.println("Podaj kolejną liczbę nieujemną, podzielną przez 5");
            inputString = scanner.nextLine();
            numberIsCorrect = checkCondition(inputString);
            if (numberIsCorrect){
                numbers.add(Integer.parseInt(inputString));
            }
        } while (numberIsCorrect);
        scanner.close();
    }

    private static void showResults(List<Integer> numbers) {
        if (!numbers.isEmpty()){
            int sum = 0;
            for (Integer number : numbers) {
                sum += number;
            }
            int countNumbers = numbers.size();
            double average = sum / numbers.size();
            System.out.println("Ile poprawnych liczb: " + countNumbers);
            System.out.println("Ich suma wynosi: " + sum);
            System.out.println("Natomiast średnia to: " + average);
        }
    }

    private static boolean checkCondition(String inputString) {
        try {
            int number = Integer.parseInt(inputString);
            boolean divisibleBy5 = number % 5 == 0;
            boolean greaterThanZero = number >= 0;
            return divisibleBy5 && greaterThanZero;
        } catch (NumberFormatException e){
            return false;
        }
    }
}
