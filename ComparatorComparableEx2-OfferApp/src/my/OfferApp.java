package my;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class OfferApp {

public static final int MAX_OFFERS = 10;

    public static void main(String[] args) {

        System.out.println("Moje rozwiązanie:");

        Offer[] offers = new Offer[MAX_OFFERS];

        String filename = "Offers.csv";
        File file = new File(filename);
        try (Scanner scanner = new Scanner(file);) {
            int i =0;
            scanner.nextLine();
             while (scanner.hasNextLine()){
                 String line = scanner.nextLine();
                 String[] values = line.split(";");
                 String city = values[0];
                 double price = Double.parseDouble(values[1]);
                 double area = Double.parseDouble(values[2]);
                 offers[i] = new Offer(city, price, area);
                 i++;
             }
        } catch (FileNotFoundException e) {
            System.err.println("File not found");
        }

        if (offers != null){
            Arrays.sort(offers);
            for (Offer offer : offers) {
                System.out.println(offer);
            }
        }

    }
}
