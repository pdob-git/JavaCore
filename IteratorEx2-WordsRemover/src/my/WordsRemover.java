package my;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

class WordsRemover {
    public static void main(String[] args) {
        System.out.println("Moje rozwiązanie");
        ArrayList<String> words = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Podaj wyraz nr " + (i + 1));
            words.add(scanner.nextLine());
        }

        System.out.println("Podaj tekst do odfiltrowania:");
        String filterWord = scanner.nextLine();
        Iterator<String> iterator = words.iterator();
        while (iterator.hasNext()) {
            String stringToProcess = iterator.next();
            if (stringToProcess.toLowerCase().contains(filterWord.toLowerCase())) {
                iterator.remove();
            }
        }

        System.out.println(words);
    }
}