package my;

import java.util.Scanner;

public class WordStatistics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj dowolny tekst z literami i cyframi");
        String s = scanner.nextLine();
        System.out.println("Liczba cyfr w tekście: " + countDigits(s));
        System.out.println("Liczba liter w tekście: " + countLetter(s));
        if (countDigits(s) > 0) {
            System.out.println("Największa cyfra w tekście to: " + maxDigit(s));
        } else if (countDigits(s) == 0) {
            System.out.println("W tekście nie znajdowała się żadna cyfra");
        }
    }

    private static int maxDigit(String s) {
        int maxDigit = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                int digit = Integer.parseInt(Character.toString(s.charAt(i)));
                if (maxDigit < digit)
                    maxDigit = digit;
            }
        }
        return maxDigit;
    }

    private static int countLetter(String s) {
        int letterCount = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetter(s.charAt(i))) {
                letterCount++;
            }
        }
        return letterCount;
    }

    private static int countDigits(String s) {
        int digitsCount = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                digitsCount++;
            }
        }
        return digitsCount;
    }


}
