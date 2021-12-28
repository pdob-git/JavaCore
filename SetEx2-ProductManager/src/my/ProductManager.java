package my;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class ProductManager {
    private static final String EXIT = "1";
    private static final String ADD_PRODUCT = "0";
    private static final String  DISCARD_PRODUCT = "0";
    private static final String REPLACE_PRODUCT = "1";
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Moje rozwiązanie");
        Set<Product> products = new HashSet<>();

        boolean controlLoop = true;
        while (controlLoop){
            showMainOptions();
            switch (scanner.nextLine()){
                case ADD_PRODUCT:
                    addProduct(products);
                    break;
                case EXIT:
                    controlLoop = false;
                    showResults(products);
                    break;
                default:
                    System.out.println("Zła opcja, spróbuj jeszcze raz");
            }
        }

    }

    private static void showResults(Set<Product> products) {
        System.out.println("Dostępne produkty:");
        for (Object product : products) {
            System.out.println(product);
        }
    }

    private static void addProduct(Set<Product> products) {
        System.out.println("Podaj nazwę produktu:");
        String productName = scanner.nextLine();
        System.out.println("Podaj cenę produktu:");
        double productPrice = Double.parseDouble(scanner.nextLine());
        Product product = new Product(productName, productPrice);
        if (products.contains(product)){
            askAndReplace(products, product);
        } else {
            products.add(product);
            System.out.println("Dodano product");
        }
    }

    private static void askAndReplace(Set<Product> products, Product product) {
        System.out.println("Znaleziono produkt o takiej nazwie, wybierz co chcesz zrobić");
        System.out.println(" > Zignoruj produkt - " + DISCARD_PRODUCT);
        System.out.println(" > Nadpisz produkt - " + REPLACE_PRODUCT);
        if (scanner.nextLine().equals(REPLACE_PRODUCT)){
            products.remove(product);
            products.add(product);
            System.out.println("Zamieniono produkt " + "\"" + product.getName() + "\"");
        } else {
            System.out.println("Zignorowano produkt " + "\"" + product.getName() + "\"");
        }
    }

    private static void showMainOptions() {
        System.out.println("Dostępne opcje:");
        System.out.println(" > Dodaj nowy produkt - " + ADD_PRODUCT);
        System.out.println(" > Koniec programu - " + EXIT);
        System.out.println("Wybierz opcję:");
    }


}
