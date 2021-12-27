package page;

import java.io.FileNotFoundException;
import java.util.Arrays;

class OfferApp {
    public static void main(String[] args) {
        System.out.println("Rozwiązanie z kursu:");
        try {
            Offer[] offers = OfferReader.readOffers("Offers.csv");
            Arrays.sort(offers);
            for (Offer offer : offers) {
                System.out.println(offer);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Brak pliku offers.csv");
        }
    }
}